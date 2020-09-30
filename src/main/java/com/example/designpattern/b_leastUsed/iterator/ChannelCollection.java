package com.example.designpattern.b_leastUsed.iterator;

public interface ChannelCollection {
	public void addChannel(Channel c);
	public void removeChannel(Channel c);
	public ChannelIterator iterator(ChannelTypeEnum type);
}
