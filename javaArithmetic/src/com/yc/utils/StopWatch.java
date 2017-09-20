package com.yc.utils;

public class StopWatch {

	private long elapsedTime; // 所运行的时间
	private long startTime; // 启动的时间点
	private long endTime; // 结束时间点
	private boolean isRunning; // 是否运行

	public StopWatch() {
		reset();
	}

	/**
	 * 启动秒表，开始计时
	 */
	public void start() {
		if (isRunning) {
			return;
		}
		isRunning = true;
		startTime = System.currentTimeMillis();
	}

	/**
	 * 停止秒表，时间停止累计，并被追加到已流逝的时间中
	 */
	public void stop() {
		if (!isRunning) {
			return;
		}
		isRunning = false;
		endTime = System.currentTimeMillis();
		elapsedTime = elapsedTime + endTime - startTime;
	}

	/**
	 * 返回总的流逝时间
	 * 
	 * @return
	 */
	public long getElapsedTime() {
		if (isRunning) {
			endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		} else {
			return elapsedTime;
		}
	}

	public void reset() {
		elapsedTime = 0;
		endTime = 0;
		isRunning = false;
	}
}
