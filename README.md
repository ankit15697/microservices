<h2>Steps to run microservice </h2>
<ul>
<li>Go to each microservice and create image of that</li>
<li>Run docker-compose.yaml </li>
</ul>
After prforming above steps microservices will be running fine.
<h2> Urls to access microservices</h2>
<ul>
<li>http://localhost:8000/currency-exchange/from/USD/to/INR</li>
<li>http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10 </li>
<li> http://localhost:8761/</li>
<li> http://localhost:9411/zipkin/</li>
<li> http://localhost:8765/currency-exchange/from/USD/to/INR</li>
<li> http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10</li>
<li>http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10</li>
</ul>
