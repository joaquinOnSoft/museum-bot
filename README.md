# Museum Bot

Bot to recover a random artwork from a Museum and publish the information in
a one or several channels like Twitter, Telegram...

## Museums 

This project extract information for the following sources:	

### Metropolitan Museum of Art Met Collection API

New York City's Metropolitan Museum of Art contains over 5000 
years of art from around the world in its collection. The 
Metropolitan Museum of Art Met Collection APITrack this API 
is a Public API released in 2018 that provides select datasets 
of information on more than 400,000 art works for unrestricted 
commercial and non commercial use. The API provides access to 
all of the Met's Open Access data and to corresponding high 
resolution images.

> **SEE:** [The Metropolitan Museum of Art Collection API](https://metmuseum.github.io/)

### Natural History Museum API

This REST API lets users access the data portal of London's Natural History Museum to retrieve collection and research datasets for use in software or applications. The datasets, returned in JSON, hold 2.7 million specimen records from the Museum’s Zoology, Botany, Mineralogy, Palaeontology and Entomology collections.

> **SEE:**
> [API Endpoint](http://data.nhm.ac.uk/api/3)
> [API Portal / Home Page](https://data.nhm.ac.uk/about/download)

### Smithsonian Institution Open Access API

The Smithsonian Institution Open Access APITrack this API 
provides access to metadata about objects in the vast Smithsonian 
museums and galleries collection. Get metadata for the objects 
(name, type, etc) also metrics about objects. Search by category or terms. 
Smithsonian Open Access enables users to share and reuse millions of the 
Smithsonian's images. This includes images and data from across the 
Smithsonian's 19 museums, 9 research centers, libraries, archives, 
and the National Zoo.

> **SEE:**
> [API Endpoint](https://api.si.edu/openaccess/api/v1.0/) and
> [API Portal / Home Page](https://www.si.edu/openaccess/devtools)
> [OpenAccess](https://github.com/Smithsonian/OpenAccess)

> **IMPORTANT**: To get and API key visit: [API Key Signup](https://api.data.gov/signup/)

### Victoria & Albert Museum REST API

The Victoria & Albert Museum API is designed as a RESTful interface to our collections and what we know about them. It returns all items in the database (paginated) in XML or JSON format. The purpose of the V&A API is to maximize access to all our collections and encourage use of them.

> **SEE:**:
> [API Endpoint](http://www.vam.ac.uk/api) and 
> [API Portal / Home Page](http://www.vam.ac.uk/api/)

### Why there are not Spanish museum?

Just because there is a serious lack of Spanish Museums Open API availability. So, I decided to start with some of the Museums which provide Open API. Some of then are listed in this
article: [Top 10 APIs for Museums](https://www.programmableweb.com/news/top-10-apis-museums/brief/2020/12/26)

## Publishers

There are several publisher for different output channels:

[Twitter  Publisher](doc/twitter-publisher.md) **Under development!!!**
Telegram **Planed**