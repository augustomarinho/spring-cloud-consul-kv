# spring-cloud-consul-kv
Project created for studying a initial setup to use Spring Cloud Consult and Consul as a Key Value Distributed environment.

# Initial Setup

  - Run Consul inside Docker :
    ```sh
        docker run -d --net=host --name=dev-consul consul:latest
    ```

# Tips
    - A good link about directory structure in Consul
    [Directory structure in Consul](https://stackoverflow.com/questions/42561136/spring-boot-get-properties-from-consul-server)

    - In this example, for creating manually files on Consul WebConsole, following this steps:
        - For all applications:
            - Create folder config/apps/
            - Create key keys: In the keys key, put your content like as a YAML file

            If you put the content below:
            name: Augusto Marinho

            You must see the log line: "Refresh keys changed: [name]"

        - For Application MyFirstConsulApp (In according to bootstrap.yml)
            - create folder config/MyFirstConsulApp/
            - Create key keys: In the keys key, put your content like as a YAML file

