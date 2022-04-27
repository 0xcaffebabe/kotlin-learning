package classesobj

// 密封类的所有直接子类在编译时都是已知的
sealed class NetworkError: Error()
class ConnectRefusedError: NetworkError()
class TimeoutError: NetworkError()

