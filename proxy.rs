use rusty_dl::{errors::DownloadError, youtube::YoutubeDownloader, Downloader, self};

pub trait Youtube {
    fn blocking_download(&mut self, url: &str) -> Result<(),DownloadError>;
    fn blocking_download_to(&mut self, url: &str, Location: &str) -> Result<(),DownloadError>;
}

pub struct YoutubeDownloaderProxy {
    urls: Vec<String>,
    downloader: Option<Box<YoutubeDownloader>>
}

impl YoutubeDownloaderProxy {
    pub fn new() -> Self {
        return Self{
            urls: vec![]
            , downloader: None
        }
    }

    pub fn check_url(&self, url: String) -> bool {
        let mut state: bool = false;

        for link in &self.urls {
            if &url == link {
                state = true;
            }
        }
        return state;
    }
}

impl Youtube for YoutubeDownloaderProxy {
    fn blocking_download(&mut self, url: &str) -> Result<(),DownloadError> {
        if self.check_url(String::from(url)) {
            println!("The video has been already downloaded!")
        } else {
            self.urls.push(String::from(url));
            self.downloader = Some(Box::new(YoutubeDownloader::new(url).expect("The video couldn't be downloaded.")));
            println!("Getting video...");
            self.downloader.as_mut().unwrap().blocking_download()?;

            println!("The video has been downloaded succesfully!");
        }
        Ok(())
    }

    fn blocking_download_to(&mut self, url: &str, location: &str) -> Result<(),DownloadError> {
         if self.check_url(String::from(url)) {
            println!("The video has been already downloaded!")
        } else {
            self.urls.push(String::from(url));
            self.downloader = Some(Box::new(YoutubeDownloader::new(url).expect("The video couldn't be downloaded.")));
            println!("Getting video...");
            self.downloader.as_mut().unwrap().blocking_download_to(location)?;

            println!("The video has been downloaded succesfully!");
        }
        Ok(())
    }
}