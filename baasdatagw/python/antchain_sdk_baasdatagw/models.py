# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(
        self,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
        protocol: str = None,
        read_timeout: int = None,
        connect_timeout: int = None,
        http_proxy: str = None,
        https_proxy: str = None,
        endpoint: str = None,
        no_proxy: str = None,
        max_idle_conns: int = None,
        user_agent: str = None,
        socks_5proxy: str = None,
        socks_5net_work: str = None,
        max_idle_time_millis: int = None,
        keep_alive_duration_millis: int = None,
        max_requests: int = None,
        max_requests_per_host: int = None,
    ):
        # accesskey id
        self.access_key_id = access_key_id
        # accesskey secret
        self.access_key_secret = access_key_secret
        # security token
        self.security_token = security_token
        # http protocol
        self.protocol = protocol
        # read timeout
        self.read_timeout = read_timeout
        # connect timeout
        self.connect_timeout = connect_timeout
        # http proxy
        self.http_proxy = http_proxy
        # https proxy
        self.https_proxy = https_proxy
        # endpoint
        self.endpoint = endpoint
        # proxy white list
        self.no_proxy = no_proxy
        # max idle conns
        self.max_idle_conns = max_idle_conns
        # user agent
        self.user_agent = user_agent
        # socks5 proxy
        self.socks_5proxy = socks_5proxy
        # socks5 network
        self.socks_5net_work = socks_5net_work
        # 长链接最大空闲时长
        self.max_idle_time_millis = max_idle_time_millis
        # 长链接最大连接时长
        self.keep_alive_duration_millis = keep_alive_duration_millis
        # 最大连接数（长链接最大总数）
        self.max_requests = max_requests
        # 每个目标主机的最大连接数（分主机域名的长链接最大总数
        self.max_requests_per_host = max_requests_per_host

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['accessKeyId'] = self.access_key_id
        if self.access_key_secret is not None:
            result['accessKeySecret'] = self.access_key_secret
        if self.security_token is not None:
            result['securityToken'] = self.security_token
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.read_timeout is not None:
            result['readTimeout'] = self.read_timeout
        if self.connect_timeout is not None:
            result['connectTimeout'] = self.connect_timeout
        if self.http_proxy is not None:
            result['httpProxy'] = self.http_proxy
        if self.https_proxy is not None:
            result['httpsProxy'] = self.https_proxy
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.no_proxy is not None:
            result['noProxy'] = self.no_proxy
        if self.max_idle_conns is not None:
            result['maxIdleConns'] = self.max_idle_conns
        if self.user_agent is not None:
            result['userAgent'] = self.user_agent
        if self.socks_5proxy is not None:
            result['socks5Proxy'] = self.socks_5proxy
        if self.socks_5net_work is not None:
            result['socks5NetWork'] = self.socks_5net_work
        if self.max_idle_time_millis is not None:
            result['maxIdleTimeMillis'] = self.max_idle_time_millis
        if self.keep_alive_duration_millis is not None:
            result['keepAliveDurationMillis'] = self.keep_alive_duration_millis
        if self.max_requests is not None:
            result['maxRequests'] = self.max_requests
        if self.max_requests_per_host is not None:
            result['maxRequestsPerHost'] = self.max_requests_per_host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accessKeyId') is not None:
            self.access_key_id = m.get('accessKeyId')
        if m.get('accessKeySecret') is not None:
            self.access_key_secret = m.get('accessKeySecret')
        if m.get('securityToken') is not None:
            self.security_token = m.get('securityToken')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('readTimeout') is not None:
            self.read_timeout = m.get('readTimeout')
        if m.get('connectTimeout') is not None:
            self.connect_timeout = m.get('connectTimeout')
        if m.get('httpProxy') is not None:
            self.http_proxy = m.get('httpProxy')
        if m.get('httpsProxy') is not None:
            self.https_proxy = m.get('httpsProxy')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('noProxy') is not None:
            self.no_proxy = m.get('noProxy')
        if m.get('maxIdleConns') is not None:
            self.max_idle_conns = m.get('maxIdleConns')
        if m.get('userAgent') is not None:
            self.user_agent = m.get('userAgent')
        if m.get('socks5Proxy') is not None:
            self.socks_5proxy = m.get('socks5Proxy')
        if m.get('socks5NetWork') is not None:
            self.socks_5net_work = m.get('socks5NetWork')
        if m.get('maxIdleTimeMillis') is not None:
            self.max_idle_time_millis = m.get('maxIdleTimeMillis')
        if m.get('keepAliveDurationMillis') is not None:
            self.keep_alive_duration_millis = m.get('keepAliveDurationMillis')
        if m.get('maxRequests') is not None:
            self.max_requests = m.get('maxRequests')
        if m.get('maxRequestsPerHost') is not None:
            self.max_requests_per_host = m.get('maxRequestsPerHost')
        return self


class ChainInsightEvent(TeaModel):
    def __init__(
        self,
        topics: List[str] = None,
        topics_decoded: List[str] = None,
        content: str = None,
        content_decoded: str = None,
    ):
        # 事件的 topics 列表
        self.topics = topics
        # 解析后的交易 topics 列表
        self.topics_decoded = topics_decoded
        # 事件的内容
        self.content = content
        # 解析后的事件内容
        self.content_decoded = content_decoded

    def validate(self):
        self.validate_required(self.topics, 'topics')
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.topics is not None:
            result['topics'] = self.topics
        if self.topics_decoded is not None:
            result['topics_decoded'] = self.topics_decoded
        if self.content is not None:
            result['content'] = self.content
        if self.content_decoded is not None:
            result['content_decoded'] = self.content_decoded
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('topics') is not None:
            self.topics = m.get('topics')
        if m.get('topics_decoded') is not None:
            self.topics_decoded = m.get('topics_decoded')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('content_decoded') is not None:
            self.content_decoded = m.get('content_decoded')
        return self


class MapEntry(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # Key
        self.key = key
        # value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ChainInsightStatisticMetricMeta(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
        metric_name: str = None,
    ):
        # 统计指标的类型；枚举：Table，Histogram
        self.type = type
        # 指标的展示名称
        self.name = name
        # 指标的实际名称（自定义指标ID）
        self.metric_name = metric_name

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.metric_name, 'metric_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.metric_name is not None:
            result['metric_name'] = self.metric_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('metric_name') is not None:
            self.metric_name = m.get('metric_name')
        return self


class ChainInsightStatisticCustomTableRow(TeaModel):
    def __init__(
        self,
        row: List[MapEntry] = None,
    ):
        # 表格的一行
        self.row = row

    def validate(self):
        self.validate_required(self.row, 'row')
        if self.row:
            for k in self.row:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['row'] = []
        if self.row is not None:
            for k in self.row:
                result['row'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.row = []
        if m.get('row') is not None:
            for k in m.get('row'):
                temp_model = MapEntry()
                self.row.append(temp_model.from_map(k))
        return self


class TriggerCheckpoint(TeaModel):
    def __init__(
        self,
        height: int = None,
        index: int = None,
        type: str = None,
        last_error: str = None,
        error_count: int = None,
        total_count: int = None,
    ):
        # 当前处理的高度
        self.height = height
        # 检查点偏移量
        self.index = index
        # 检查点的类型
        self.type = type
        # 最近的错误信息
        self.last_error = last_error
        # 错误计数
        self.error_count = error_count
        # 推送的事件数量
        self.total_count = total_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.height is not None:
            result['height'] = self.height
        if self.index is not None:
            result['index'] = self.index
        if self.type is not None:
            result['type'] = self.type
        if self.last_error is not None:
            result['last_error'] = self.last_error
        if self.error_count is not None:
            result['error_count'] = self.error_count
        if self.total_count is not None:
            result['total_count'] = self.total_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('height') is not None:
            self.height = m.get('height')
        if m.get('index') is not None:
            self.index = m.get('index')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('last_error') is not None:
            self.last_error = m.get('last_error')
        if m.get('error_count') is not None:
            self.error_count = m.get('error_count')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        return self


class ChainInsightSearchResultItem(TeaModel):
    def __init__(
        self,
        type: str = None,
        biz_id: str = None,
        score: int = None,
        values: List[MapEntry] = None,
    ):
        # 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
        self.type = type
        # 结果所在的链ID
        self.biz_id = biz_id
        # 结果与搜索请求的相关性程度，(0, 10000000]
        self.score = score
        # 搜索结果值
        self.values = values

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.score, 'score')
        self.validate_required(self.values, 'values')
        if self.values:
            for k in self.values:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.score is not None:
            result['score'] = self.score
        result['values'] = []
        if self.values is not None:
            for k in self.values:
                result['values'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('score') is not None:
            self.score = m.get('score')
        self.values = []
        if m.get('values') is not None:
            for k in m.get('values'):
                temp_model = MapEntry()
                self.values.append(temp_model.from_map(k))
        return self


class ChainInsightPoint(TeaModel):
    def __init__(
        self,
        x: int = None,
        y: int = None,
    ):
        # x坐标，4位定点小数， 10000 表示 1
        self.x = x
        # y坐标，4位定点小数， 10000 表示 1
        self.y = y

    def validate(self):
        self.validate_required(self.x, 'x')
        self.validate_required(self.y, 'y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x is not None:
            result['x'] = self.x
        if self.y is not None:
            result['y'] = self.y
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x') is not None:
            self.x = m.get('x')
        if m.get('y') is not None:
            self.y = m.get('y')
        return self


class ChainInsightTransaction(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        id: str = None,
        type: str = None,
        state: str = None,
        from_: str = None,
        to: str = None,
        input: str = None,
        function: str = None,
        input_decoded: str = None,
        output: str = None,
        output_decoded: str = None,
        block_num: int = None,
        tx_index: int = None,
        data: str = None,
        events: List[ChainInsightEvent] = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 交易ID
        self.id = id
        # 交易类型
        self.type = type
        # 交易状态，VALID 表示合法，其它为错误码
        self.state = state
        # 交易发起者地址
        self.from_ = from_
        # 交易目标地址
        self.to = to
        # 交易原始输入，hex编码
        self.input = input
        # 交易调用的函数名
        self.function = function
        # 交易输入解析后的 json string
        self.input_decoded = input_decoded
        # 交易的返回值
        self.output = output
        # 交易返回值解析后的 json string
        self.output_decoded = output_decoded
        # 交易所在区块高度
        self.block_num = block_num
        # 交易所在区块中的 index
        self.tx_index = tx_index
        # 原始交易的 json string
        self.data = data
        # 交易中的事件
        self.events = events

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.state, 'state')
        self.validate_required(self.from_, 'from_')
        self.validate_required(self.to, 'to')
        self.validate_required(self.input, 'input')
        self.validate_required(self.block_num, 'block_num')
        self.validate_required(self.tx_index, 'tx_index')
        if self.events:
            for k in self.events:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.state is not None:
            result['state'] = self.state
        if self.from_ is not None:
            result['from'] = self.from_
        if self.to is not None:
            result['to'] = self.to
        if self.input is not None:
            result['input'] = self.input
        if self.function is not None:
            result['function'] = self.function
        if self.input_decoded is not None:
            result['input_decoded'] = self.input_decoded
        if self.output is not None:
            result['output'] = self.output
        if self.output_decoded is not None:
            result['output_decoded'] = self.output_decoded
        if self.block_num is not None:
            result['block_num'] = self.block_num
        if self.tx_index is not None:
            result['tx_index'] = self.tx_index
        if self.data is not None:
            result['data'] = self.data
        result['events'] = []
        if self.events is not None:
            for k in self.events:
                result['events'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('state') is not None:
            self.state = m.get('state')
        if m.get('from') is not None:
            self.from_ = m.get('from')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('input') is not None:
            self.input = m.get('input')
        if m.get('function') is not None:
            self.function = m.get('function')
        if m.get('input_decoded') is not None:
            self.input_decoded = m.get('input_decoded')
        if m.get('output') is not None:
            self.output = m.get('output')
        if m.get('output_decoded') is not None:
            self.output_decoded = m.get('output_decoded')
        if m.get('block_num') is not None:
            self.block_num = m.get('block_num')
        if m.get('tx_index') is not None:
            self.tx_index = m.get('tx_index')
        if m.get('data') is not None:
            self.data = m.get('data')
        self.events = []
        if m.get('events') is not None:
            for k in m.get('events'):
                temp_model = ChainInsightEvent()
                self.events.append(temp_model.from_map(k))
        return self


class ChainInsightSearchRequest(TeaModel):
    def __init__(
        self,
        offset: int = None,
        context: str = None,
        pag_size: int = None,
        query: str = None,
        timeline_query: str = None,
        start_time: int = None,
        end_time: int = None,
        enabled_types: List[str] = None,
    ):
        # 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
        self.offset = offset
        # 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
        self.context = context
        # 页大小
        self.pag_size = pag_size
        # 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
        self.query = query
        # 查询某个合约或者存证账户的时间轴返回结果
        self.timeline_query = timeline_query
        # 查询范围的开始时间戳，毫秒
        self.start_time = start_time
        # 查询范围的终止时间戳，单位毫秒
        self.end_time = end_time
        # 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
        self.enabled_types = enabled_types

    def validate(self):
        self.validate_required(self.offset, 'offset')
        self.validate_required(self.pag_size, 'pag_size')
        self.validate_required(self.query, 'query')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.offset is not None:
            result['offset'] = self.offset
        if self.context is not None:
            result['context'] = self.context
        if self.pag_size is not None:
            result['pag_size'] = self.pag_size
        if self.query is not None:
            result['query'] = self.query
        if self.timeline_query is not None:
            result['timeline_query'] = self.timeline_query
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.enabled_types is not None:
            result['enabled_types'] = self.enabled_types
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        if m.get('context') is not None:
            self.context = m.get('context')
        if m.get('pag_size') is not None:
            self.pag_size = m.get('pag_size')
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('timeline_query') is not None:
            self.timeline_query = m.get('timeline_query')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('enabled_types') is not None:
            self.enabled_types = m.get('enabled_types')
        return self


class ChainInsightContractInterfaceArgument(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        location: str = None,
        comment: str = None,
    ):
        # 参数名
        self.name = name
        # 参数类型
        self.type = type
        # 参数位置，枚举：input，output，deposit
        self.location = location
        # 参数的业务名称
        self.comment = comment

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.location, 'location')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.location is not None:
            result['location'] = self.location
        if self.comment is not None:
            result['comment'] = self.comment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('comment') is not None:
            self.comment = m.get('comment')
        return self


class ChainInsightStatisticTask(TeaModel):
    def __init__(
        self,
        id: str = None,
        type: str = None,
        biz_id: str = None,
        address: str = None,
        metrics: List[ChainInsightStatisticMetricMeta] = None,
        create_time: int = None,
        modify_time: int = None,
        status: str = None,
    ):
        # 统计任务ID
        self.id = id
        # 统计任务类型
        self.type = type
        # 所属链ID
        self.biz_id = biz_id
        # 统计的链上合约地址
        self.address = address
        # 任务产出的指标信息
        self.metrics = metrics
        # 任务创建时间，毫秒时间戳
        self.create_time = create_time
        # 任务修改时间，毫秒时间戳
        self.modify_time = modify_time
        # 任务状态：Running： 运行中； Paused: 已暂停
        self.status = status

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.metrics, 'metrics')
        if self.metrics:
            for k in self.metrics:
                if k:
                    k.validate()
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.address is not None:
            result['address'] = self.address
        result['metrics'] = []
        if self.metrics is not None:
            for k in self.metrics:
                result['metrics'].append(k.to_map() if k else None)
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('address') is not None:
            self.address = m.get('address')
        self.metrics = []
        if m.get('metrics') is not None:
            for k in m.get('metrics'):
                temp_model = ChainInsightStatisticMetricMeta()
                self.metrics.append(temp_model.from_map(k))
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ChainInsightHistogram(TeaModel):
    def __init__(
        self,
        x_label: str = None,
        y_label: str = None,
        points: List[ChainInsightPoint] = None,
        name: str = None,
    ):
        # 横坐标名称
        self.x_label = x_label
        # 纵坐标名称
        self.y_label = y_label
        # 坐标集，按x增序
        self.points = points
        # 表格的名称或维度名称
        self.name = name

    def validate(self):
        self.validate_required(self.points, 'points')
        if self.points:
            for k in self.points:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.x_label is not None:
            result['x_label'] = self.x_label
        if self.y_label is not None:
            result['y_label'] = self.y_label
        result['points'] = []
        if self.points is not None:
            for k in self.points:
                result['points'].append(k.to_map() if k else None)
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('x_label') is not None:
            self.x_label = m.get('x_label')
        if m.get('y_label') is not None:
            self.y_label = m.get('y_label')
        self.points = []
        if m.get('points') is not None:
            for k in m.get('points'):
                temp_model = ChainInsightPoint()
                self.points.append(temp_model.from_map(k))
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class ChainInsightStatisticCustomTablesResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightStatisticCustomTableRow] = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 总条数
        self.total = total
        # 表格每一行内容，    Key 为列名，    Value，列的取值
        self.list = list

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.current, 'current')
        self.validate_required(self.total, 'total')
        self.validate_required(self.list, 'list')
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightStatisticCustomTableRow()
                self.list.append(temp_model.from_map(k))
        return self


class ChainInsightAddressLatestTxsResponse(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[ChainInsightTransaction] = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页码
        self.current = current
        # 合计
        self.total = total
        # 近期交易详情
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = ChainInsightTransaction()
                self.list.append(temp_model.from_map(k))
        return self


class DataSearchResultResponseLog(TeaModel):
    def __init__(
        self,
        meta_id: str = None,
        function: str = None,
        topic: str = None,
        block_num: int = None,
        tx_id: str = None,
        data: str = None,
        log: str = None,
        type: str = None,
        tx_timestamp: int = None,
    ):
        # 数据关联的合约Meta信息
        self.meta_id = meta_id
        # 交易调用的函数名称
        self.function = function
        # 交易产生的事件名称
        self.topic = topic
        # 交易所在的区块高度
        self.block_num = block_num
        # 交易ID
        self.tx_id = tx_id
        # Json 序列化的交易请求参数
        self.data = data
        # 交易中合约输出的日志内容
        self.log = log
        # 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
        self.type = type
        # 交易上链时间戳，单位毫秒
        self.tx_timestamp = tx_timestamp

    def validate(self):
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.block_num, 'block_num')
        self.validate_required(self.tx_id, 'tx_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.tx_timestamp, 'tx_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.function is not None:
            result['function'] = self.function
        if self.topic is not None:
            result['topic'] = self.topic
        if self.block_num is not None:
            result['block_num'] = self.block_num
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.data is not None:
            result['data'] = self.data
        if self.log is not None:
            result['log'] = self.log
        if self.type is not None:
            result['type'] = self.type
        if self.tx_timestamp is not None:
            result['tx_timestamp'] = self.tx_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('function') is not None:
            self.function = m.get('function')
        if m.get('topic') is not None:
            self.topic = m.get('topic')
        if m.get('block_num') is not None:
            self.block_num = m.get('block_num')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('data') is not None:
            self.data = m.get('data')
        if m.get('log') is not None:
            self.log = m.get('log')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tx_timestamp') is not None:
            self.tx_timestamp = m.get('tx_timestamp')
        return self


class ContractMeta(TeaModel):
    def __init__(
        self,
        id: int = None,
        create_time: int = None,
        update_time: int = None,
        contract_name: str = None,
        contract_addr: str = None,
        contract_version: str = None,
        meta_type: str = None,
        start_block: int = None,
        end_block: int = None,
        public_flag: int = None,
        meta_content: str = None,
    ):
        # MetaID
        self.id = id
        # 合约Meta创建时间
        self.create_time = create_time
        # 合约Meta更新时间
        self.update_time = update_time
        # 合约名称
        self.contract_name = contract_name
        # 合约名称对应的Hex编码合约地址
        self.contract_addr = contract_addr
        # 合约版本号，用于助记
        self.contract_version = contract_version
        # 合约Meta的类型，枚举类型；
        self.meta_type = meta_type
        # 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
        self.start_block = start_block
        # 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
        self.end_block = end_block
        # 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
        self.public_flag = public_flag
        # 合约Meta对应类型的数据
        self.meta_content = meta_content

    def validate(self):
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_addr, 'contract_addr')
        self.validate_required(self.contract_version, 'contract_version')
        self.validate_required(self.meta_type, 'meta_type')
        self.validate_required(self.meta_content, 'meta_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        if self.contract_version is not None:
            result['contract_version'] = self.contract_version
        if self.meta_type is not None:
            result['meta_type'] = self.meta_type
        if self.start_block is not None:
            result['start_block'] = self.start_block
        if self.end_block is not None:
            result['end_block'] = self.end_block
        if self.public_flag is not None:
            result['public_flag'] = self.public_flag
        if self.meta_content is not None:
            result['meta_content'] = self.meta_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        if m.get('contract_version') is not None:
            self.contract_version = m.get('contract_version')
        if m.get('meta_type') is not None:
            self.meta_type = m.get('meta_type')
        if m.get('start_block') is not None:
            self.start_block = m.get('start_block')
        if m.get('end_block') is not None:
            self.end_block = m.get('end_block')
        if m.get('public_flag') is not None:
            self.public_flag = m.get('public_flag')
        if m.get('meta_content') is not None:
            self.meta_content = m.get('meta_content')
        return self


class ChainInsightContractInterface(TeaModel):
    def __init__(
        self,
        name: str = None,
        name_sig: str = None,
        type: str = None,
    ):
        # 展示的函数名称
        self.name = name
        # 接口中使用的函数名称标识符
        self.name_sig = name_sig
        # 接口的类型，枚举：function, event, deposit
        self.type = type

    def validate(self):
        self.validate_required(self.name_sig, 'name_sig')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.name_sig is not None:
            result['name_sig'] = self.name_sig
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_sig') is not None:
            self.name_sig = m.get('name_sig')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class DataSearchRequest(TeaModel):
    def __init__(
        self,
        query: str = None,
        offset: int = None,
        size: int = None,
        reverse: bool = None,
        to: int = None,
        total: int = None,
    ):
        # 所有请求字符串，支持使用 and, or 逻辑连接词和括号
        self.query = query
        # 分页，返回数据结果起始位置
        self.offset = offset
        # 请求的结果数量，默认值 10
        self.size = size
        # 是否按时间降序排列
        self.reverse = reverse
        # 检索数据的截止时间范围，Unix时间戳（秒）
        self.to = to
        # 检索结果的总条数
        self.total = total

    def validate(self):
        self.validate_required(self.query, 'query')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.query is not None:
            result['query'] = self.query
        if self.offset is not None:
            result['offset'] = self.offset
        if self.size is not None:
            result['size'] = self.size
        if self.reverse is not None:
            result['reverse'] = self.reverse
        if self.to is not None:
            result['to'] = self.to
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('query') is not None:
            self.query = m.get('query')
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        if m.get('size') is not None:
            self.size = m.get('size')
        if m.get('reverse') is not None:
            self.reverse = m.get('reverse')
        if m.get('to') is not None:
            self.to = m.get('to')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class TriggerLog(TeaModel):
    def __init__(
        self,
        uuid: str = None,
        create_time: int = None,
        modify_time: int = None,
        position: TriggerCheckpoint = None,
        status: str = None,
    ):
        # 日志的唯一ID
        self.uuid = uuid
        # 日志的发生时间
        self.create_time = create_time
        # 日志的最近修改时间
        self.modify_time = modify_time
        # 日志发生的位置
        self.position = position
        # 日志状态
        self.status = status

    def validate(self):
        self.validate_required(self.uuid, 'uuid')
        self.validate_required(self.position, 'position')
        if self.position:
            self.position.validate()
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uuid is not None:
            result['uuid'] = self.uuid
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.position is not None:
            result['position'] = self.position.to_map()
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uuid') is not None:
            self.uuid = m.get('uuid')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('position') is not None:
            temp_model = TriggerCheckpoint()
            self.position = temp_model.from_map(m['position'])
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ChainInsightSearchResponse(TeaModel):
    def __init__(
        self,
        total: int = None,
        took: int = None,
        context: str = None,
        items: List[ChainInsightSearchResultItem] = None,
    ):
        # 搜索命中的结果总数
        self.total = total
        # 搜索总共消耗了多长时间，时间单位毫秒
        self.took = took
        # 当前搜索的 context；翻页时请求中的 context 需要配置为该值
        self.context = context
        # 搜索结果
        self.items = items

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.took, 'took')
        self.validate_required(self.context, 'context')
        self.validate_required(self.items, 'items')
        if self.items:
            for k in self.items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.took is not None:
            result['took'] = self.took
        if self.context is not None:
            result['context'] = self.context
        result['items'] = []
        if self.items is not None:
            for k in self.items:
                result['items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('took') is not None:
            self.took = m.get('took')
        if m.get('context') is not None:
            self.context = m.get('context')
        self.items = []
        if m.get('items') is not None:
            for k in m.get('items'):
                temp_model = ChainInsightSearchResultItem()
                self.items.append(temp_model.from_map(k))
        return self


class ChainInsightAddressLabel(TeaModel):
    def __init__(
        self,
        address: str = None,
        name: str = None,
        comments: str = None,
        labels: List[MapEntry] = None,
    ):
        # 链上账户或者合约地址
        self.address = address
        # 账户或者合约的真实名称
        self.name = name
        # 用户定义的地址描述信息
        self.comments = comments
        # 合约/账户地址的标签信息
        self.labels = labels

    def validate(self):
        if self.labels:
            for k in self.labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.name is not None:
            result['name'] = self.name
        if self.comments is not None:
            result['comments'] = self.comments
        result['labels'] = []
        if self.labels is not None:
            for k in self.labels:
                result['labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('comments') is not None:
            self.comments = m.get('comments')
        self.labels = []
        if m.get('labels') is not None:
            for k in m.get('labels'):
                temp_model = MapEntry()
                self.labels.append(temp_model.from_map(k))
        return self


class ServiceStatus(TeaModel):
    def __init__(
        self,
        service: str = None,
        state: str = None,
    ):
        # 服务名称
        self.service = service
        # 服务的开通与关闭状态
        self.state = state

    def validate(self):
        self.validate_required(self.service, 'service')
        self.validate_required(self.state, 'state')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service is not None:
            result['service'] = self.service
        if self.state is not None:
            result['state'] = self.state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service') is not None:
            self.service = m.get('service')
        if m.get('state') is not None:
            self.state = m.get('state')
        return self


class ChainInsightBlock(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        chain: str = None,
        network: str = None,
        number: int = None,
        hash: str = None,
        create_time: int = None,
        previous_hash: str = None,
        transactions: List[ChainInsightTransaction] = None,
        data: str = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 链ID
        self.chain = chain
        # 所在子网
        self.network = network
        # 区块高度
        self.number = number
        # 区块Hash
        self.hash = hash
        # 区块创建时间戳
        self.create_time = create_time
        # 上一个区块Hash
        self.previous_hash = previous_hash
        # 区块内交易列表
        self.transactions = transactions
        # 区块的json序列化string
        self.data = data

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.chain, 'chain')
        self.validate_required(self.network, 'network')
        self.validate_required(self.number, 'number')
        self.validate_required(self.hash, 'hash')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.previous_hash, 'previous_hash')
        self.validate_required(self.transactions, 'transactions')
        if self.transactions:
            for k in self.transactions:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.chain is not None:
            result['chain'] = self.chain
        if self.network is not None:
            result['network'] = self.network
        if self.number is not None:
            result['number'] = self.number
        if self.hash is not None:
            result['hash'] = self.hash
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.previous_hash is not None:
            result['previous_hash'] = self.previous_hash
        result['transactions'] = []
        if self.transactions is not None:
            for k in self.transactions:
                result['transactions'].append(k.to_map() if k else None)
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('chain') is not None:
            self.chain = m.get('chain')
        if m.get('network') is not None:
            self.network = m.get('network')
        if m.get('number') is not None:
            self.number = m.get('number')
        if m.get('hash') is not None:
            self.hash = m.get('hash')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('previous_hash') is not None:
            self.previous_hash = m.get('previous_hash')
        self.transactions = []
        if m.get('transactions') is not None:
            for k in m.get('transactions'):
                temp_model = ChainInsightTransaction()
                self.transactions.append(temp_model.from_map(k))
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class Trigger(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        source: str = None,
        create_time: int = None,
        error_message: str = None,
        status: str = None,
        pending_error_logs: int = None,
        checkpoint: TriggerCheckpoint = None,
        options: List[MapEntry] = None,
    ):
        # 导出任务唯一ID
        self.name = name
        # 导出目标
        self.type = type
        # 导出的事件类型
        self.source = source
        # 创建时间戳
        self.create_time = create_time
        # 最近的错误描述信息
        self.error_message = error_message
        # 任务的状态
        self.status = status
        # 导出任务的待处理错误日志数量
        self.pending_error_logs = pending_error_logs
        # 检查点信息
        self.checkpoint = checkpoint
        # 导出任务配置
        self.options = options

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        if self.checkpoint:
            self.checkpoint.validate()
        self.validate_required(self.options, 'options')
        if self.options:
            for k in self.options:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.source is not None:
            result['source'] = self.source
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.status is not None:
            result['status'] = self.status
        if self.pending_error_logs is not None:
            result['pending_error_logs'] = self.pending_error_logs
        if self.checkpoint is not None:
            result['checkpoint'] = self.checkpoint.to_map()
        result['options'] = []
        if self.options is not None:
            for k in self.options:
                result['options'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('pending_error_logs') is not None:
            self.pending_error_logs = m.get('pending_error_logs')
        if m.get('checkpoint') is not None:
            temp_model = TriggerCheckpoint()
            self.checkpoint = temp_model.from_map(m['checkpoint'])
        self.options = []
        if m.get('options') is not None:
            for k in m.get('options'):
                temp_model = MapEntry()
                self.options.append(temp_model.from_map(k))
        return self


class ChainInsightAddress(TeaModel):
    def __init__(
        self,
        biz_id: str = None,
        biz_id_name: str = None,
        address: str = None,
        creator_organization: str = None,
        creator: str = None,
        craete_time: int = None,
        create_tx_id: str = None,
        modify_time: int = None,
        modify_tx_id: str = None,
        type: str = None,
        status: str = None,
        balance: int = None,
        auth_map: List[MapEntry] = None,
        recover_key: str = None,
        contract_type: str = None,
    ):
        # 链ID
        self.biz_id = biz_id
        # 链名称
        self.biz_id_name = biz_id_name
        # 账户或合约地址
        self.address = address
        # 创建者租户ID
        self.creator_organization = creator_organization
        # 创建者地址
        self.creator = creator
        # 创建时间
        self.craete_time = craete_time
        # 创建交易ID
        self.create_tx_id = create_tx_id
        # 修改时间戳
        self.modify_time = modify_time
        # 最近修改账户的交易ID
        self.modify_tx_id = modify_tx_id
        # 地址类型，枚举：Account，Contract
        self.type = type
        # 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
        self.status = status
        # 地址余额
        self.balance = balance
        # 认证Map
        self.auth_map = auth_map
        # 地址恢复公钥
        self.recover_key = recover_key
        # 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
        self.contract_type = contract_type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.address, 'address')
        self.validate_required(self.creator, 'creator')
        self.validate_required(self.craete_time, 'craete_time')
        self.validate_required(self.create_tx_id, 'create_tx_id')
        self.validate_required(self.modify_time, 'modify_time')
        self.validate_required(self.modify_tx_id, 'modify_tx_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.balance, 'balance')
        self.validate_required(self.auth_map, 'auth_map')
        if self.auth_map:
            for k in self.auth_map:
                if k:
                    k.validate()
        self.validate_required(self.recover_key, 'recover_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.biz_id_name is not None:
            result['biz_id_name'] = self.biz_id_name
        if self.address is not None:
            result['address'] = self.address
        if self.creator_organization is not None:
            result['creator_organization'] = self.creator_organization
        if self.creator is not None:
            result['creator'] = self.creator
        if self.craete_time is not None:
            result['craete_time'] = self.craete_time
        if self.create_tx_id is not None:
            result['create_tx_id'] = self.create_tx_id
        if self.modify_time is not None:
            result['modify_time'] = self.modify_time
        if self.modify_tx_id is not None:
            result['modify_tx_id'] = self.modify_tx_id
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.balance is not None:
            result['balance'] = self.balance
        result['auth_map'] = []
        if self.auth_map is not None:
            for k in self.auth_map:
                result['auth_map'].append(k.to_map() if k else None)
        if self.recover_key is not None:
            result['recover_key'] = self.recover_key
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('biz_id_name') is not None:
            self.biz_id_name = m.get('biz_id_name')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('creator_organization') is not None:
            self.creator_organization = m.get('creator_organization')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('craete_time') is not None:
            self.craete_time = m.get('craete_time')
        if m.get('create_tx_id') is not None:
            self.create_tx_id = m.get('create_tx_id')
        if m.get('modify_time') is not None:
            self.modify_time = m.get('modify_time')
        if m.get('modify_tx_id') is not None:
            self.modify_tx_id = m.get('modify_tx_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('balance') is not None:
            self.balance = m.get('balance')
        self.auth_map = []
        if m.get('auth_map') is not None:
            for k in m.get('auth_map'):
                temp_model = MapEntry()
                self.auth_map.append(temp_model.from_map(k))
        if m.get('recover_key') is not None:
            self.recover_key = m.get('recover_key')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        return self


class DataExportTableField(TeaModel):
    def __init__(
        self,
        column_name: str = None,
        field: str = None,
        column_type: str = None,
        column_size: int = None,
        column_description: str = None,
    ):
        # 列名称
        self.column_name = column_name
        # 事件中字段提取的 jq 表达式
        self.field = field
        # 列类型
        self.column_type = column_type
        # 列大小
        self.column_size = column_size
        # 列描述
        self.column_description = column_description

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.column_name is not None:
            result['column_name'] = self.column_name
        if self.field is not None:
            result['field'] = self.field
        if self.column_type is not None:
            result['column_type'] = self.column_type
        if self.column_size is not None:
            result['column_size'] = self.column_size
        if self.column_description is not None:
            result['column_description'] = self.column_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('column_name') is not None:
            self.column_name = m.get('column_name')
        if m.get('field') is not None:
            self.field = m.get('field')
        if m.get('column_type') is not None:
            self.column_type = m.get('column_type')
        if m.get('column_size') is not None:
            self.column_size = m.get('column_size')
        if m.get('column_description') is not None:
            self.column_description = m.get('column_description')
        return self


class QueryDatasearchSearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_conditions: List[str] = None,
        query: DataSearchRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 检索的metaId范围；私有化不支持，参数留空
        self.meta_conditions = meta_conditions
        # 检索请求
        self.query = query

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.query, 'query')
        if self.query:
            self.query.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_conditions is not None:
            result['meta_conditions'] = self.meta_conditions
        if self.query is not None:
            result['query'] = self.query.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_conditions') is not None:
            self.meta_conditions = m.get('meta_conditions')
        if m.get('query') is not None:
            temp_model = DataSearchRequest()
            self.query = temp_model.from_map(m['query'])
        return self


class QueryDatasearchSearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        context: DataSearchRequest = None,
        logs: List[DataSearchResultResponseLog] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求下一页的Request
        self.context = context
        # 检索的结果
        self.logs = logs

    def validate(self):
        if self.context:
            self.context.validate()
        if self.logs:
            for k in self.logs:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.context is not None:
            result['context'] = self.context.to_map()
        result['logs'] = []
        if self.logs is not None:
            for k in self.logs:
                result['logs'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('context') is not None:
            temp_model = DataSearchRequest()
            self.context = temp_model.from_map(m['context'])
        self.logs = []
        if m.get('logs') is not None:
            for k in m.get('logs'):
                temp_model = DataSearchResultResponseLog()
                self.logs.append(temp_model.from_map(k))
        return self


class StartDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        contract: str = None,
        start_height: int = None,
        end_height: int = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 合约 hex 编码的地址
        self.contract = contract
        # 索引的起始位置，同合约ABI的起始位置； 0 表示从头
        self.start_height = start_height
        # 索引的终止位置，同合约ABI的终止位置；0 表示到最新
        self.end_height = end_height
        # 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.contract, 'contract')
        self.validate_required(self.start_height, 'start_height')
        self.validate_required(self.end_height, 'end_height')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.contract is not None:
            result['contract'] = self.contract
        if self.start_height is not None:
            result['start_height'] = self.start_height
        if self.end_height is not None:
            result['end_height'] = self.end_height
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('contract') is not None:
            self.contract = m.get('contract')
        if m.get('start_height') is not None:
            self.start_height = m.get('start_height')
        if m.get('end_height') is not None:
            self.end_height = m.get('end_height')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class StartDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class StopDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI的ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class StopDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class RemoveDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class RemoveDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约索引的任务的状态
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class GetDatasearchIndexRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: str = None,
        index_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约ABI meta ID
        self.meta_id = meta_id
        # 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        self.index_type = index_type

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')
        self.validate_required(self.index_type, 'index_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        if self.index_type is not None:
            result['index_type'] = self.index_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        if m.get('index_type') is not None:
            self.index_type = m.get('index_type')
        return self


class GetDatasearchIndexResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 索引的索引进度（块高）
        self.status = status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class ListContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        contract_addr: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约 hex 编码的地址, 留空表示所有合约
        self.contract_addr = contract_addr

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.contract_addr is not None:
            result['contract_addr'] = self.contract_addr
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('contract_addr') is not None:
            self.contract_addr = m.get('contract_addr')
        return self


class ListContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        metas: List[ContractMeta] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta列表
        self.metas = metas

    def validate(self):
        if self.metas:
            for k in self.metas:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['metas'] = []
        if self.metas is not None:
            for k in self.metas:
                result['metas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.metas = []
        if m.get('metas') is not None:
            for k in m.get('metas'):
                temp_model = ContractMeta()
                self.metas.append(temp_model.from_map(k))
        return self


class AddContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta: ContractMeta = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约Meta
        self.meta = meta

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta, 'meta')
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class AddContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        meta: ContractMeta = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta
        self.meta = meta

    def validate(self):
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class DeleteContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 要删除的合约MetaID
        self.meta_id = meta_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        return self


class DeleteContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GetContractmetaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        meta_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 合约MetaId
        self.meta_id = meta_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.meta_id, 'meta_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.meta_id is not None:
            result['meta_id'] = self.meta_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('meta_id') is not None:
            self.meta_id = m.get('meta_id')
        return self


class GetContractmetaResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        meta: ContractMeta = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 合约Meta
        self.meta = meta

    def validate(self):
        if self.meta:
            self.meta.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.meta is not None:
            result['meta'] = self.meta.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('meta') is not None:
            temp_model = ContractMeta()
            self.meta = temp_model.from_map(m['meta'])
        return self


class CreateDataexportPreviewdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 任务配置
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class CreateDataexportPreviewdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 异步任务ID
        self.task_id = task_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDataexportPreviewdataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 异步任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDataexportPreviewdataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 预览数据
        self.data = data

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class GetDataexportPreviewsmappingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        type: str = None,
        data: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 获取的映射类型
        self.type = type
        # 预览返回的数据
        self.data = data

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.type, 'type')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class GetDataexportPreviewsmappingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DataExportTableField] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 映射关系列表
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DataExportTableField()
                self.data.append(temp_model.from_map(k))
        return self


class CreateDataexportTriggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户唯一标识符（租户ID）
        self.tenant_id = tenant_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 导出任务
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class CreateDataexportTriggerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDataexportPreviewsqlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # -\
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class QueryDataexportPreviewsqlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sql: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建表的SQL语句
        self.sql = sql

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.sql is not None:
            result['sql'] = self.sql
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sql') is not None:
            self.sql = m.get('sql')
        return self


class ListDataexportTriggerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        return self


class ListDataexportTriggerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        triggers: List[Trigger] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.triggers = triggers

    def validate(self):
        if self.triggers:
            for k in self.triggers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['triggers'] = []
        if self.triggers is not None:
            for k in self.triggers:
                result['triggers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.triggers = []
        if m.get('triggers') is not None:
            for k in m.get('triggers'):
                temp_model = Trigger()
                self.triggers.append(temp_model.from_map(k))
        return self


class OperateDataexportTriggerstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 操作
        self.action = action

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.action, 'action')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        return self


class OperateDataexportTriggerstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trigger: Trigger = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.trigger = trigger

    def validate(self):
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class OperateDataexportTriggerconfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        trigger: Trigger = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.tenant_id = tenant_id
        # -\
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # -\
        self.trigger = trigger

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.trigger, 'trigger')
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class OperateDataexportTriggerconfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trigger: Trigger = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.trigger = trigger

    def validate(self):
        if self.trigger:
            self.trigger.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trigger is not None:
            result['trigger'] = self.trigger.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trigger') is not None:
            temp_model = Trigger()
            self.trigger = temp_model.from_map(m['trigger'])
        return self


class ListDataexportTriggerlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # biz_id
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 状态过滤条件
        self.action = action
        # -\
        self.page_no = page_no
        # -\
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListDataexportTriggerlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        page_size: int = None,
        current: int = None,
        total: int = None,
        list: List[TriggerLog] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.page_size = page_size
        # -\
        self.current = current
        # -\
        self.total = total
        # -\
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.current is not None:
            result['current'] = self.current
        if self.total is not None:
            result['total'] = self.total
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = TriggerLog()
                self.list.append(temp_model.from_map(k))
        return self


class OperateDataexportTriggerlogRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        biz_id: str = None,
        name: str = None,
        action: str = None,
        logs: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # tenant_id
        self.tenant_id = tenant_id
        # biz_id
        self.biz_id = biz_id
        # 导出任务ID
        self.name = name
        # 操作
        self.action = action
        # 导出任务日志ID列表
        self.logs = logs

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.action, 'action')
        self.validate_required(self.logs, 'logs')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.action is not None:
            result['action'] = self.action
        if self.logs is not None:
            result['logs'] = self.logs
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('action') is not None:
            self.action = m.get('action')
        if m.get('logs') is not None:
            self.logs = m.get('logs')
        return self


class OperateDataexportTriggerlogResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryChaininsightLabelsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_addresses: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 需要查询的地址列表
        self.hex_addresses = hex_addresses

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_addresses, 'hex_addresses')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_addresses is not None:
            result['hex_addresses'] = self.hex_addresses
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_addresses') is not None:
            self.hex_addresses = m.get('hex_addresses')
        return self


class QueryChaininsightLabelsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightAddressLabel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 地址的标签信息
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightAddressLabel()
                self.result.append(temp_model.from_map(k))
        return self


class UpdateChaininsightLabelsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        label: ChainInsightAddressLabel = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 更新的 label 内容
        self.label = label

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.label, 'label')
        if self.label:
            self.label.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.label is not None:
            result['label'] = self.label.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('label') is not None:
            temp_model = ChainInsightAddressLabel()
            self.label = temp_model.from_map(m['label'])
        return self


class UpdateChaininsightLabelsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryChaininsightSearchRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_ids: List[str] = None,
        request: ChainInsightSearchRequest = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
        self.biz_ids = biz_ids
        # 搜索请求
        self.request = request

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.request, 'request')
        if self.request:
            self.request.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_ids is not None:
            result['biz_ids'] = self.biz_ids
        if self.request is not None:
            result['request'] = self.request.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_ids') is not None:
            self.biz_ids = m.get('biz_ids')
        if m.get('request') is not None:
            temp_model = ChainInsightSearchRequest()
            self.request = temp_model.from_map(m['request'])
        return self


class QueryChaininsightSearchResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightSearchResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 搜索结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightSearchResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        return self


class QueryChaininsightAddressResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAddress = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAddress()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tx_id: str = None,
        tee_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 交易ID
        self.tx_id = tx_id
        # hex编码的TEE交易解密Key，留空表示不解密
        self.tee_key = tee_key

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.tx_id, 'tx_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.tee_key is not None:
            result['tee_key'] = self.tee_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('tee_key') is not None:
            self.tee_key = m.get('tee_key')
        return self


class QueryChaininsightTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightTransaction = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightTransaction()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightBlockRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 区块高度
        self.num = num

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.num, 'num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.num is not None:
            result['num'] = self.num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('num') is not None:
            self.num = m.get('num')
        return self


class QueryChaininsightBlockResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightBlock = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightBlock()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddresslatesttxsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 页码
        self.page_no = page_no
        # 页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryChaininsightAddresslatesttxsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightAddressLatestTxsResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightAddressLatestTxsResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class ListChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 需要查询的版本信息，0表示最新
        self.ver = ver

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        return self


class ListChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightContractInterface] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightContractInterface()
                self.result.append(temp_model.from_map(k))
        return self


class DetailChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        contract_interface: ChainInsightContractInterface = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 版本信息（块高）
        self.ver = ver
        # 接口
        self.contract_interface = contract_interface

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.contract_interface, 'contract_interface')
        if self.contract_interface:
            self.contract_interface.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.contract_interface is not None:
            result['contract_interface'] = self.contract_interface.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('contract_interface') is not None:
            temp_model = ChainInsightContractInterface()
            self.contract_interface = temp_model.from_map(m['contract_interface'])
        return self


class DetailChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightContractInterfaceArgument] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightContractInterfaceArgument()
                self.result.append(temp_model.from_map(k))
        return self


class UpdateChaininsightContractinterfaceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        contract_interface: ChainInsightContractInterface = None,
        interface_argument: ChainInsightContractInterfaceArgument = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 版本信息
        self.ver = ver
        # 接口信息
        self.contract_interface = contract_interface
        # 新的接口参数信息
        self.interface_argument = interface_argument

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.contract_interface, 'contract_interface')
        if self.contract_interface:
            self.contract_interface.validate()
        self.validate_required(self.interface_argument, 'interface_argument')
        if self.interface_argument:
            self.interface_argument.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.contract_interface is not None:
            result['contract_interface'] = self.contract_interface.to_map()
        if self.interface_argument is not None:
            result['interface_argument'] = self.interface_argument.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('contract_interface') is not None:
            temp_model = ChainInsightContractInterface()
            self.contract_interface = temp_model.from_map(m['contract_interface'])
        if m.get('interface_argument') is not None:
            temp_model = ChainInsightContractInterfaceArgument()
            self.interface_argument = temp_model.from_map(m['interface_argument'])
        return self


class UpdateChaininsightContractinterfaceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class UploadChaininsightAbiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        ver: str = None,
        file: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 链上地址
        self.hex_address = hex_address
        # 对应的合约版本
        self.ver = ver
        # ABI文件原始内容
        self.file = file

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.file, 'file')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.ver is not None:
            result['ver'] = self.ver
        if self.file is not None:
            result['file'] = self.file
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('file') is not None:
            self.file = m.get('file')
        return self


class UploadChaininsightAbiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class QueryChaininsightAddresshistogramrxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 地址
        self.hex_address = hex_address
        # 开始时间戳，毫秒
        self.start_time = start_time
        # 结束时间戳，毫秒
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryChaininsightAddresshistogramrxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightAddresshistogramtxRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        hex_address: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 地址
        self.hex_address = hex_address
        # 开始时间戳
        self.start_time = start_time
        # 结束时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.hex_address, 'hex_address')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryChaininsightAddresshistogramtxResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightChaintxhistogramRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        union_id: str = None,
        biz_id: str = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 联盟ID
        self.union_id = union_id
        # 链ID，可选；留空表示联盟内所有链
        self.biz_id = biz_id
        # 开始时间戳
        self.start_time = start_time
        # 结束时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.union_id, 'union_id')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.union_id is not None:
            result['union_id'] = self.union_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('union_id') is not None:
            self.union_id = m.get('union_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryChaininsightChaintxhistogramResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightHistogram = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightHistogram()
            self.result = temp_model.from_map(m['result'])
        return self


class BatchqueryChaininsightTransactionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class BatchqueryChaininsightTransactionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class ListChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        type: str = None,
        hex_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计类型，ContractStatistic：合约性能检测指标
        self.type = type
        # 合约地址
        self.hex_address = hex_address

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        return self


class ListChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightStatisticTask] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightStatisticTask()
                self.result.append(temp_model.from_map(k))
        return self


class AddChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        type: str = None,
        hex_address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计类型，    ContractStatistic： 合约性能检测指标
        self.type = type
        # 链上合约地址
        self.hex_address = hex_address

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.type is not None:
            result['type'] = self.type
        if self.hex_address is not None:
            result['hex_address'] = self.hex_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('hex_address') is not None:
            self.hex_address = m.get('hex_address')
        return self


class AddChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticTask()
            self.result = temp_model.from_map(m['result'])
        return self


class OperateChaininsightStatisticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        task_id: str = None,
        operation: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 统计任务ID
        self.task_id = task_id
        # 操作方式； Delete 删除
        self.operation = operation

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.operation, 'operation')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.operation is not None:
            result['operation'] = self.operation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('operation') is not None:
            self.operation = m.get('operation')
        return self


class OperateChaininsightStatisticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticTask = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticTask()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryChaininsightStatistichistogramRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        name: str = None,
        dimensions: List[str] = None,
        start_time: int = None,
        end_time: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 自定义通知指标的ID
        self.name = name
        # 多个维度名称，空表示所有维度
        self.dimensions = dimensions
        # 查询开始时间，毫秒时间戳
        self.start_time = start_time
        # 查询结束时间，毫秒时间戳
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.dimensions is not None:
            result['dimensions'] = self.dimensions
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('dimensions') is not None:
            self.dimensions = m.get('dimensions')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class QueryChaininsightStatistichistogramResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: List[ChainInsightHistogram] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            for k in self.result:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['result'] = []
        if self.result is not None:
            for k in self.result:
                result['result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.result = []
        if m.get('result') is not None:
            for k in m.get('result'):
                temp_model = ChainInsightHistogram()
                self.result.append(temp_model.from_map(k))
        return self


class QueryChaininsightStatistictableRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        name: str = None,
        dimensions: List[str] = None,
        page_size: int = None,
        page_no: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # 自定义统计的指标ID
        self.name = name
        # 多个维度名称，空表示所有维度
        self.dimensions = dimensions
        # 分页大小
        self.page_size = page_size
        # 页码
        self.page_no = page_no

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.name is not None:
            result['name'] = self.name
        if self.dimensions is not None:
            result['dimensions'] = self.dimensions
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_no is not None:
            result['page_no'] = self.page_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('dimensions') is not None:
            self.dimensions = m.get('dimensions')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        return self


class QueryChaininsightStatistictableResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: ChainInsightStatisticCustomTablesResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            temp_model = ChainInsightStatisticCustomTablesResponse()
            self.result = temp_model.from_map(m['result'])
        return self


class CreateChaininsightQrcodeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        page_type: str = None,
        param_map: List[MapEntry] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链ID
        self.biz_id = biz_id
        # QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
        self.page_type = page_type
        # 页面对应的参数
        self.param_map = param_map

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.page_type, 'page_type')
        self.validate_required(self.param_map, 'param_map')
        if self.param_map:
            for k in self.param_map:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.page_type is not None:
            result['page_type'] = self.page_type
        result['param_map'] = []
        if self.param_map is not None:
            for k in self.param_map:
                result['param_map'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('page_type') is not None:
            self.page_type = m.get('page_type')
        self.param_map = []
        if m.get('param_map') is not None:
            for k in m.get('param_map'):
                temp_model = MapEntry()
                self.param_map.append(temp_model.from_map(k))
        return self


class CreateChaininsightQrcodeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # base64编码的png图片
        self.result = result

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class RegisterChainsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        ver: int = None,
        type: str = None,
        mychain_nodes: List[str] = None,
        mychain_type: str = None,
        mychain_truststore: str = None,
        mychain_truststore_password: str = None,
        mychain_client_crt: str = None,
        mychain_client_key: str = None,
        mychain_client_key_pwd: str = None,
        mychain_tls_algo: str = None,
        mychain_identity_algo: str = None,
        mychain_groupid: str = None,
        mychain_parent_bizid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 链唯一标识符
        self.biz_id = biz_id
        # 链配置的最后更新时间（用于标识版本）
        self.ver = ver
        # 链类型
        self.type = type
        # 节点RPC接口地址
        self.mychain_nodes = mychain_nodes
        # MyChain版本
        self.mychain_type = mychain_type
        # base64编码的JDS
        self.mychain_truststore = mychain_truststore
        # -\
        self.mychain_truststore_password = mychain_truststore_password
        # -\
        self.mychain_client_crt = mychain_client_crt
        # -\
        self.mychain_client_key = mychain_client_key
        # -\
        self.mychain_client_key_pwd = mychain_client_key_pwd
        # -\
        self.mychain_tls_algo = mychain_tls_algo
        # -\
        self.mychain_identity_algo = mychain_identity_algo
        # 子链 groupID
        self.mychain_groupid = mychain_groupid
        # 子链的父链ID
        self.mychain_parent_bizid = mychain_parent_bizid

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.ver, 'ver')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.ver is not None:
            result['ver'] = self.ver
        if self.type is not None:
            result['type'] = self.type
        if self.mychain_nodes is not None:
            result['mychain_nodes'] = self.mychain_nodes
        if self.mychain_type is not None:
            result['mychain_type'] = self.mychain_type
        if self.mychain_truststore is not None:
            result['mychain_truststore'] = self.mychain_truststore
        if self.mychain_truststore_password is not None:
            result['mychain_truststore_password'] = self.mychain_truststore_password
        if self.mychain_client_crt is not None:
            result['mychain_client_crt'] = self.mychain_client_crt
        if self.mychain_client_key is not None:
            result['mychain_client_key'] = self.mychain_client_key
        if self.mychain_client_key_pwd is not None:
            result['mychain_client_key_pwd'] = self.mychain_client_key_pwd
        if self.mychain_tls_algo is not None:
            result['mychain_tls_algo'] = self.mychain_tls_algo
        if self.mychain_identity_algo is not None:
            result['mychain_identity_algo'] = self.mychain_identity_algo
        if self.mychain_groupid is not None:
            result['mychain_groupid'] = self.mychain_groupid
        if self.mychain_parent_bizid is not None:
            result['mychain_parent_bizid'] = self.mychain_parent_bizid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('ver') is not None:
            self.ver = m.get('ver')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('mychain_nodes') is not None:
            self.mychain_nodes = m.get('mychain_nodes')
        if m.get('mychain_type') is not None:
            self.mychain_type = m.get('mychain_type')
        if m.get('mychain_truststore') is not None:
            self.mychain_truststore = m.get('mychain_truststore')
        if m.get('mychain_truststore_password') is not None:
            self.mychain_truststore_password = m.get('mychain_truststore_password')
        if m.get('mychain_client_crt') is not None:
            self.mychain_client_crt = m.get('mychain_client_crt')
        if m.get('mychain_client_key') is not None:
            self.mychain_client_key = m.get('mychain_client_key')
        if m.get('mychain_client_key_pwd') is not None:
            self.mychain_client_key_pwd = m.get('mychain_client_key_pwd')
        if m.get('mychain_tls_algo') is not None:
            self.mychain_tls_algo = m.get('mychain_tls_algo')
        if m.get('mychain_identity_algo') is not None:
            self.mychain_identity_algo = m.get('mychain_identity_algo')
        if m.get('mychain_groupid') is not None:
            self.mychain_groupid = m.get('mychain_groupid')
        if m.get('mychain_parent_bizid') is not None:
            self.mychain_parent_bizid = m.get('mychain_parent_bizid')
        return self


class RegisterChainsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class OperateChainsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.biz_id = biz_id
        # 不留空表示给租户开通权限
        self.tenant_id = tenant_id
        # 操作类型，默认留空表示开通
        self.type = type

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class OperateChainsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class GetChainsStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # -\
        self.biz_id = biz_id
        # -\
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class GetChainsStatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: List[ServiceStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -\
        self.status = status

    def validate(self):
        if self.status:
            for k in self.status:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        result['status'] = []
        if self.status is not None:
            for k in self.status:
                result['status'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.status = []
        if m.get('status') is not None:
            for k in m.get('status'):
                temp_model = ServiceStatus()
                self.status.append(temp_model.from_map(k))
        return self


