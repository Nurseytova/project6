package builder;

public class BuilderEx {
    public static void main(String[] args){
       House house= new HouseBuilderImpl().setWalls("Red").setDoors(2).setRoof("Green").setWindows(4).build();
       house.getHouse();
    }
}
class House{
    /*attributes for House)*/
    public String walls;
    public int doors;
    public int windows;
    public String roof;
    public int garage;
    public void getHouse(){
        System.out.println("Color of walls " +walls + ", Number of doors " + doors + ", Number of windows " + windows + ", roof color " + roof + ", Number of garage "+ garage);
    }
}

interface HouseBuilder{
    HouseBuilder setWalls(String walls);
    HouseBuilder setDoors(int doors);
    HouseBuilder setWindows(int windows);
    HouseBuilder setRoof(String roof);
    HouseBuilder setGarage(int garage);
    House build();
}

class HouseBuilderImpl implements HouseBuilder{
    House employee=new House();

    @Override
    public HouseBuilder setWalls(String walls) {
        employee.walls=walls;
        return this;
    }

    @Override
    public HouseBuilder setDoors(int doors) {
        employee.doors=doors;
        return this;
    }

    @Override
    public HouseBuilder setWindows(int windows) {
        employee.windows=windows;
        return this;
    }

    @Override
    public HouseBuilder setRoof(String roof) {
        employee.roof=roof;
        return this;
    }
    @Override
    public HouseBuilder setGarage(int garage) {
        employee.garage=garage;
        return this;
    }
    @Override
    public House build() {
        return employee;
    }
}







