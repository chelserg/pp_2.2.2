package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {
private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW", "RED"));
        cars.add(new Car(2,"VAZ", "WHITE"));
        cars.add(new Car(3,"Honda", "ORANGE"));
        cars.add(new Car(4,"Audi", "YELLOW"));
        cars.add(new Car(5,"UAZ", "BLACK"));

    }

    @Override
    public List<Car> carCount(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
