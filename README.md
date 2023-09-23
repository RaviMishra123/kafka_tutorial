@RestController annotation is used to define a restfull webservices and handles the web request
@RequestMapping annotation is used to define the uri to access a rest endpoint
@RequestBody annotation is used to define the request body content type

@getMapping handles the http get request
spring mvc internal uses jackson library and message convertors to convert java object into a json
@ResponseBody annotation uses http message convertors to convert the return value (java object) to http response body (json),
based on the content type in the request http header
@GetMapping(value="endpoint", produces=MediaType.Application_xml_value)
byDefault spring use jackson as a media type
Rest Api with path variable - @PathVariable annotation we bind the request url template path variable to the method variable.
Rest Api with request param - @RequestParam
CRUD Rest Api