# PeaKBench

    Benchmarking is an essential suite supporting development of database management systems. It runs a set of well defined data and workloads on a specific hardware configuration to gather the results to fill the measurements. It is used widely for evaluating new technology or comparing different systems so as to promote the progress of database systems. 
    PeakBench is a new benchmarking tool, which puts much more effort for domain specific needs, i.e.,  workload dynamics, skewness, concurrence control and resource contention for TP businesses. We design the tool with full adaptiveness and extensibility for developers and vendors to define their own workload characteristics simulating their business. One of the representative applications is SecKill (Second Kill) which generates intensive workloads with high dynamics, severe concurrence and violent contention. 
   The detailed usage information can be found: 

Benchmarking is an essential aspect of any database management system effort. With the study of new 
applications having critical transaction processing requirements, we see an explosion of designing 
innovative scalable databases or new processing architecture on traditional databases dealing with 
high intensive transaction workloads. These new applications have obvious characteristics of sharp 
dynamics, terrific skewness, and high concurrence, which are called SecKill and can saturate the 
traditional database systems by high workloads and intensive contention. Due to the lack of such 
an application-oriented benchmark simulating the real workloads, it results in lots of unnecessary 
engineering efforts and makes the performance evaluation difficult to compare. To remedy this problem 
and assist database selection we present PeakBench, a SecKill-oriented transactional processing (OLTP) benchmark.

## Dependencies

+ Java (+1.8)
