# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(self, access_key_id=None, access_key_secret=None, security_token=None, protocol=None,
                 read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None,
                 max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None):
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

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['securityToken'] = self.security_token
        result['protocol'] = self.protocol
        result['readTimeout'] = self.read_timeout
        result['connectTimeout'] = self.connect_timeout
        result['httpProxy'] = self.http_proxy
        result['httpsProxy'] = self.https_proxy
        result['endpoint'] = self.endpoint
        result['noProxy'] = self.no_proxy
        result['maxIdleConns'] = self.max_idle_conns
        result['userAgent'] = self.user_agent
        result['socks5Proxy'] = self.socks_5proxy
        result['socks5NetWork'] = self.socks_5net_work
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.security_token = map.get('securityToken')
        self.protocol = map.get('protocol')
        self.read_timeout = map.get('readTimeout')
        self.connect_timeout = map.get('connectTimeout')
        self.http_proxy = map.get('httpProxy')
        self.https_proxy = map.get('httpsProxy')
        self.endpoint = map.get('endpoint')
        self.no_proxy = map.get('noProxy')
        self.max_idle_conns = map.get('maxIdleConns')
        self.user_agent = map.get('userAgent')
        self.socks_5proxy = map.get('socks5Proxy')
        self.socks_5net_work = map.get('socks5NetWork')
        return self


class Dog(TeaModel):
    def __init__(self, adopted_date=None, age=None, is_adopted=None, marks=None, name=None):
        self.adopted_date = adopted_date
        self.age = age
        self.is_adopted = is_adopted
        self.marks = marks
        self.name = name

    def validate(self):
        if self.adopted_date:
            self.validate_pattern(self.adopted_date, 'adopted_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]')
        if self.name:
            self.validate_max_length(self.name, 'name', 32)

    def to_map(self):
        result = {}
        result['adopted_date'] = self.adopted_date
        result['age'] = self.age
        result['is_adopted'] = self.is_adopted
        result['marks'] = []
        if self.marks is not None:
            for k in self.marks:
                result['marks'].append(k)
        else:
            result['marks'] = None
        result['name'] = self.name
        return result

    def from_map(self, map={}):
        self.adopted_date = map.get('adopted_date')
        self.age = map.get('age')
        self.is_adopted = map.get('is_adopted')
        self.marks = []
        if map.get('marks') is not None:
            for k in map.get('marks'):
                self.marks.append(k)
        else:
            self.marks = None
        self.name = map.get('name')
        return self


class DogHome(TeaModel):
    def __init__(self, dog_members=None, leader=None):
        self.dog_members = dog_members
        self.leader = leader

    def validate(self):
        if self.dog_members:
            for k in self.dog_members:
                if k:
                    k.validate()
        if self.leader:
            self.leader.validate()

    def to_map(self):
        result = {}
        result['dog_members'] = []
        if self.dog_members is not None:
            for k in self.dog_members:
                result['dog_members'].append(k.to_map() if k else None)
        else:
            result['dog_members'] = None
        if self.leader is not None:
            result['leader'] = self.leader.to_map()
        else:
            result['leader'] = None
        return result

    def from_map(self, map={}):
        self.dog_members = []
        if map.get('dog_members') is not None:
            for k in map.get('dog_members'):
                temp_model = Dog()
                temp_model = temp_model.from_map(k)
                self.dog_members.append(temp_model)
        else:
            self.dog_members = None
        if map.get('leader') is not None:
            temp_model = Dog()
            self.leader = temp_model.from_map(map['leader'])
        else:
            self.leader = None
        return self


class GetDemoDogAgeRequest(TeaModel):
    def __init__(self, auth_token=None, product_instance_id=None, region_name=None, id=None):
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        self.region_name = region_name
        self.id = id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['auth_token'] = self.auth_token
        result['product_instance_id'] = self.product_instance_id
        result['region_name'] = self.region_name
        result['id'] = self.id
        return result

    def from_map(self, map={}):
        self.auth_token = map.get('auth_token')
        self.product_instance_id = map.get('product_instance_id')
        self.region_name = map.get('region_name')
        self.id = map.get('id')
        return self


class GetDemoDogAgeResponse(TeaModel):
    def __init__(self, req_msg_id=None, result_code=None, result_msg=None, age=None):
        self.req_msg_id = req_msg_id
        self.result_code = result_code
        self.result_msg = result_msg
        self.age = age

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['req_msg_id'] = self.req_msg_id
        result['result_code'] = self.result_code
        result['result_msg'] = self.result_msg
        result['age'] = self.age
        return result

    def from_map(self, map={}):
        self.req_msg_id = map.get('req_msg_id')
        self.result_code = map.get('result_code')
        self.result_msg = map.get('result_msg')
        self.age = map.get('age')
        return self
