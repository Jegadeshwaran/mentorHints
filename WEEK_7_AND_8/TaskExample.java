package WEEK_7_AND_8;

import java.util.ArrayList;
import java.util.Comparator;

interface Task{
	void execute();
	int getPriority();
}

class BackupTask implements Task{
	int priority;
	BackupTask(int priority){
		this.priority = priority;
	}
	public void execute() {
		System.out.println("Executing Backup Task");
	}
	public int getPriority() {
		return priority;
	}
}
class CleanupTask implements Task{
	int priority;
	CleanupTask(int priority){
		this.priority = priority;
	}
	public void execute() {
		System.out.println("Executing Cleanup Task");
	}
	public int getPriority() {
		return priority;
	}
}

class ReportTask implements Task{
	int priority;
	ReportTask(int priority){
		this.priority = priority;
	}
	public void execute() {
		System.out.println("Executing Report Task");
	}
	public int getPriority() {
		return priority;
	}
}

class TaskScheduler {
	ArrayList<Task> tasks  = new ArrayList<>();
	
	void add(Task task) {
		tasks.add(task);
	}
	
	void executeTask() {
		tasks.sort(Comparator.comparingInt(Task::getPriority));
		for(Task task:tasks) {
			task.execute();
		}
	}
}
public class TaskExample {

	public static void main(String[] args) {
		TaskScheduler t = new TaskScheduler();
		t.add(new BackupTask(1));
		t.add(new CleanupTask(2));
		t.add(new ReportTask(3));
		t.executeTask();

	}

}
