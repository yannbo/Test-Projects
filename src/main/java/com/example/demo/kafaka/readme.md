##Setup
Reference link:https://blog.csdn.net/woshixiazaizhe/article/details/80610432.

###1、启动 zookeeper
    ``./bin/windows/zookeeper-server-start.bat config/zookeeper.properties.``
    
###2、启动 kafaka
    ``./bin/windows/kafka-server-start.bat config/server.properties.``
    
###3. Create topic.

###4. Produce message (add message which belong to topic to sequence).

###5. Consume message (fetch message from sequence).