class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    # Method-accelerate
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    # Method-stop
    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


# Create objects
car1 = Car("Toyota", "Corolla", 2022, "Manual", "Red")
car2 = Car("Honda", "Civic", 2023, "Automatic", "Blue")
car3 = Car("Tesla", "Model 3", 2024, "Automatic", "White")

# methods
car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()