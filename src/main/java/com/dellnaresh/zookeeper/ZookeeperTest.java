package com.dellnaresh.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by nareshm on 5/12/2016.
 */
public class ZookeeperTest {

    public static void main(String[] args) throws IOException, InterruptedException {
    ZooKeeperConnection connection=new ZooKeeperConnection();
        connection.connect("localhost");
    }
}
