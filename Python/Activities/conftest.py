import pytest


@pytest.fixture
def numbers():
    return list(range(11))
