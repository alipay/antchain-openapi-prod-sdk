# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel

"""
Model for initing client
"""


class Config(TeaModel):
    def __init__(self, access_key_id=None, access_key_secret=None, auth_token=None, protocol=None, region_id=None, read_timeout=None, connect_timeout=None, http_proxy=None, https_proxy=None, endpoint=None, no_proxy=None, max_idle_conns=None, user_agent=None, socks_5proxy=None, socks_5net_work=None, tenant=None, workspace=None):
        self.access_key_id = access_key_id
        self.access_key_secret = access_key_secret
        self.auth_token = auth_token
        self.protocol = protocol
        self.region_id = region_id
        self.read_timeout = read_timeout
        self.connect_timeout = connect_timeout
        self.http_proxy = http_proxy
        self.https_proxy = https_proxy
        self.endpoint = endpoint
        self.no_proxy = no_proxy
        self.max_idle_conns = max_idle_conns
        self.user_agent = user_agent
        self.socks_5proxy = socks_5proxy
        self.socks_5net_work = socks_5net_work
        self.tenant = tenant
        self.workspace = workspace

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['accessKeyId'] = self.access_key_id
        result['accessKeySecret'] = self.access_key_secret
        result['authToken'] = self.auth_token
        result['protocol'] = self.protocol
        result['regionId'] = self.region_id
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
        result['tenant'] = self.tenant
        result['workspace'] = self.workspace
        return result

    def from_map(self, map={}):
        self.access_key_id = map.get('accessKeyId')
        self.access_key_secret = map.get('accessKeySecret')
        self.auth_token = map.get('authToken')
        self.protocol = map.get('protocol')
        self.region_id = map.get('regionId')
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
        self.tenant = map.get('tenant')
        self.workspace = map.get('workspace')
        return self


class Cert(TeaModel):
    def __init__(self, cert_code=None, cert_end_time=None, cert_id=None, cert_name_cn=None, cert_name_en=None, cert_publish_time=None, cert_start_time=None, cert_status=None, cert_url=None, country=None, expire_type=None, feature_url=None, holder_avatar=None, holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None, type=None):
        self.cert_code = cert_code
        self.cert_end_time = cert_end_time
        self.cert_id = cert_id
        self.cert_name_cn = cert_name_cn
        self.cert_name_en = cert_name_en
        self.cert_publish_time = cert_publish_time
        self.cert_start_time = cert_start_time
        self.cert_status = cert_status
        self.cert_url = cert_url
        self.country = country
        self.expire_type = expire_type
        self.feature_url = feature_url
        self.holder_avatar = holder_avatar
        self.holder_name = holder_name
        self.level = level
        self.org_did = org_did
        self.org_name = org_name
        self.org_user_id = org_user_id
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3
        self.type = type

    def validate(self):
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 64)
        if self.cert_end_time:
            self.validate_pattern(cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.cert_id:
            self.validate_max_length(cert_id, 'cert_id', 128)
        if self.cert_name_cn:
            self.validate_max_length(cert_name_cn, 'cert_name_cn', 64)
        if self.cert_publish_time:
            self.validate_pattern(cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.cert_start_time:
            self.validate_pattern(cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.cert_url:
            self.validate_max_length(cert_url, 'cert_url', 256)
        if self.country:
            self.validate_max_length(country, 'country', 32)
        if self.feature_url:
            self.validate_max_length(feature_url, 'feature_url', 512)
        if self.holder_avatar:
            self.validate_max_length(holder_avatar, 'holder_avatar', 256)
        if self.holder_name:
            self.validate_max_length(holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(level, 'level', 32)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 64)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 64)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 64)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 64)

    def to_map(self):
        result = {}
        result['cert_code'] = self.cert_code
        result['cert_end_time'] = self.cert_end_time
        result['cert_id'] = self.cert_id
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['cert_url'] = self.cert_url
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['feature_url'] = self.feature_url
        result['holder_avatar'] = self.holder_avatar
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.cert_code = map.get('cert_code')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_id = map.get('cert_id')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.cert_url = map.get('cert_url')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.feature_url = map.get('feature_url')
        self.holder_avatar = map.get('holder_avatar')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.type = map.get('type')
        return self


class OrgUser(TeaModel):
    def __init__(self, org_did=None, org_user_id=None):
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class Class_(TeaModel):
    def __init__(self, class_id=None, org_did=None):
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class DeleteCourseClassRequest(TeaModel):
    def __init__(self, class_list=None, course_id=None, org_did=None):
        self.class_list = []
        self.course_id = course_id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k :
                    k.validate()
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.class_list.append(temp_model)
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class DeleteCourseClassResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class ApplyCertUrlRequest(TeaModel):
    def __init__(self, cert_code=None, org_did=None, org_user_id=None):
        self.cert_code = cert_code
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['cert_code'] = self.cert_code
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.cert_code = map.get('cert_code')
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class ApplyCertUrlResponse(TeaModel):
    def __init__(self, cert_upload_url=None, feature_upload_url=None, holder_avatar_upload_url=None):
        self.cert_upload_url = cert_upload_url
        self.feature_upload_url = feature_upload_url
        self.holder_avatar_upload_url = holder_avatar_upload_url

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cert_upload_url'] = self.cert_upload_url
        result['feature_upload_url'] = self.feature_upload_url
        result['holder_avatar_upload_url'] = self.holder_avatar_upload_url
        return result

    def from_map(self, map={}):
        self.cert_upload_url = map.get('cert_upload_url')
        self.feature_upload_url = map.get('feature_upload_url')
        self.holder_avatar_upload_url = map.get('holder_avatar_upload_url')
        return self


class AddCourseClassRequest(TeaModel):
    def __init__(self, class_list=None, course_id=None, org_did=None):
        self.class_list = []
        self.course_id = course_id
        self.org_did = org_did

    def validate(self):
        if self.class_list:
            for k in self.class_list:
                if k :
                    k.validate()
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_list'] = []
        if self.class_list is not None:
            for k in self.class_list:
                result['class_list'].append(k.to_map() if k else None)
        else:
            result['class_list'] = None
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_list = []
        if map.get('class_list') is not None:
            for k in map.get('class_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.class_list.append(temp_model)
        else:
            self.class_list = None
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        return self


class AddCourseClassResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = Class()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class AddClassUserRequest(TeaModel):
    def __init__(self, class_id=None, org_did=None, org_user_list=None):
        self.class_id = class_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class AddClassUserResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class QueryOrganizationCertRequest(TeaModel):
    def __init__(self, end=None, org_did=None, start=None):
        self.end = end
        self.org_did = org_did
        self.start = start

    def validate(self):
        if self.end:
            self.validate_pattern(end, 'end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.start:
            self.validate_pattern(start, 'start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')

    def to_map(self):
        result = {}
        result['end'] = self.end
        result['org_did'] = self.org_did
        result['start'] = self.start
        return result

    def from_map(self, map={}):
        self.end = map.get('end')
        self.org_did = map.get('org_did')
        self.start = map.get('start')
        return self


class QueryOrganizationCertResponse(TeaModel):
    def __init__(self, cert_id_list=None):
        self.cert_id_list = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cert_id_list'] = []
        if self.cert_id_list is not None:
            for k in self.cert_id_list:
                result['cert_id_list'].append(k)
        else:
            result['cert_id_list'] = None
        return result

    def from_map(self, map={}):
        self.cert_id_list = []
        if map.get('cert_id_list') is not None:
            for k in map.get('cert_id_list'):
                self.cert_id_list.append(k)
        else:
            self.cert_id_list = None
        return self


class AddCourseUserRequest(TeaModel):
    def __init__(self, course_id=None, org_did=None, org_user_list=None):
        self.course_id = course_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class AddCourseUserResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class DeleteCourseUserRequest(TeaModel):
    def __init__(self, course_id=None, org_did=None, org_user_list=None):
        self.course_id = course_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['course_id'] = self.course_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.course_id = map.get('course_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class DeleteCourseUserResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class CreateOrganizationClassRequest(TeaModel):
    def __init__(self, capacity=None, class_end_time=None, class_name=None, class_start_time=None, class_status=None, org_did=None, type=None):
        self.capacity = capacity
        self.class_end_time = class_end_time
        self.class_name = class_name
        self.class_start_time = class_start_time
        self.class_status = class_status
        self.org_did = org_did
        self.type = type

    def validate(self):
        if self.class_end_time:
            self.validate_pattern(class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.class_name:
            self.validate_max_length(class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        self.type = map.get('type')
        return self


class CreateOrganizationClassResponse(TeaModel):
    def __init__(self, class_id=None):
        self.class_id = class_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        return self


class QueryClassUserRequest(TeaModel):
    def __init__(self, class_id=None, org_did=None):
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryClassUserResponse(TeaModel):
    def __init__(self, class_name=None, org_user_id_list=None, user_num=None):
        self.class_name = class_name
        self.org_user_id_list = []
        self.user_num = user_num

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['class_name'] = self.class_name
        result['org_user_id_list'] = []
        if self.org_user_id_list is not None:
            for k in self.org_user_id_list:
                result['org_user_id_list'].append(k)
        else:
            result['org_user_id_list'] = None
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.class_name = map.get('class_name')
        self.org_user_id_list = []
        if map.get('org_user_id_list') is not None:
            for k in map.get('org_user_id_list'):
                self.org_user_id_list.append(k)
        else:
            self.org_user_id_list = None
        self.user_num = map.get('user_num')
        return self


class QueryCertRequest(TeaModel):
    def __init__(self, cert_id=None, org_did=None):
        self.cert_id = cert_id
        self.org_did = org_did

    def validate(self):
        if self.cert_id:
            self.validate_max_length(cert_id, 'cert_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['cert_id'] = self.cert_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.cert_id = map.get('cert_id')
        self.org_did = map.get('org_did')
        return self


class QueryCertResponse(TeaModel):
    def __init__(self, cert=None):
        self.cert = cert

    def validate(self):
        if self.cert:
            self.cert.validate()

    def to_map(self):
        result = {}
        if self.cert is not None:
            result['cert'] = self.cert.to_map()
        else:
            result['cert'] = None
        return result

    def from_map(self, map={}):
        if map.get('cert') is not None:
            temp_model = Cert()
            self.cert = temp_model.from_map(map['cert'])
        else:
            self.cert = None
        return self


class UpdateOrganizationCourseRequest(TeaModel):
    def __init__(self, course_end_time=None, course_id=None, course_name=None, course_start_time=None, org_did=None, period=None):
        self.course_end_time = course_end_time
        self.course_id = course_id
        self.course_name = course_name
        self.course_start_time = course_start_time
        self.org_did = org_did
        self.period = period

    def validate(self):
        if self.course_end_time:
            self.validate_pattern(course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.course_id:
            self.validate_max_length(course_id, 'course_id', 128)
        if self.course_name:
            self.validate_max_length(course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['course_end_time'] = self.course_end_time
        result['course_id'] = self.course_id
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.course_end_time = map.get('course_end_time')
        self.course_id = map.get('course_id')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class UpdateOrganizationCourseResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class CancelPersonRequest(TeaModel):
    def __init__(self, person_did=None):
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.person_did = map.get('person_did')
        return self


class CancelPersonResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class CreateUserCertRequest(TeaModel):
    def __init__(self, cert_code=None, cert_end_time=None, cert_name_cn=None, cert_name_en=None, cert_publish_time=None, cert_start_time=None, cert_status=None, country=None, expire_type=None, holder_name=None, level=None, org_did=None, org_name=None, org_user_id=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None, type=None):
        self.cert_code = cert_code
        self.cert_end_time = cert_end_time
        self.cert_name_cn = cert_name_cn
        self.cert_name_en = cert_name_en
        self.cert_publish_time = cert_publish_time
        self.cert_start_time = cert_start_time
        self.cert_status = cert_status
        self.country = country
        self.expire_type = expire_type
        self.holder_name = holder_name
        self.level = level
        self.org_did = org_did
        self.org_name = org_name
        self.org_user_id = org_user_id
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3
        self.type = type

    def validate(self):
        if self.cert_code:
            self.validate_max_length(cert_code, 'cert_code', 64)
        if self.cert_end_time:
            self.validate_pattern(cert_end_time, 'cert_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.cert_name_cn:
            self.validate_max_length(cert_name_cn, 'cert_name_cn', 64)
        if self.cert_name_en:
            self.validate_max_length(cert_name_en, 'cert_name_en', 64)
        if self.cert_publish_time:
            self.validate_pattern(cert_publish_time, 'cert_publish_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.cert_start_time:
            self.validate_pattern(cert_start_time, 'cert_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.country:
            self.validate_max_length(country, 'country', 32)
        if self.holder_name:
            self.validate_max_length(holder_name, 'holder_name', 64)
        if self.level:
            self.validate_max_length(level, 'level', 32)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 1024)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 1024)
        if self.type:
            self.validate_max_length(type, 'type', 64)

    def to_map(self):
        result = {}
        result['cert_code'] = self.cert_code
        result['cert_end_time'] = self.cert_end_time
        result['cert_name_cn'] = self.cert_name_cn
        result['cert_name_en'] = self.cert_name_en
        result['cert_publish_time'] = self.cert_publish_time
        result['cert_start_time'] = self.cert_start_time
        result['cert_status'] = self.cert_status
        result['country'] = self.country
        result['expire_type'] = self.expire_type
        result['holder_name'] = self.holder_name
        result['level'] = self.level
        result['org_did'] = self.org_did
        result['org_name'] = self.org_name
        result['org_user_id'] = self.org_user_id
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        result['type'] = self.type
        return result

    def from_map(self, map={}):
        self.cert_code = map.get('cert_code')
        self.cert_end_time = map.get('cert_end_time')
        self.cert_name_cn = map.get('cert_name_cn')
        self.cert_name_en = map.get('cert_name_en')
        self.cert_publish_time = map.get('cert_publish_time')
        self.cert_start_time = map.get('cert_start_time')
        self.cert_status = map.get('cert_status')
        self.country = map.get('country')
        self.expire_type = map.get('expire_type')
        self.holder_name = map.get('holder_name')
        self.level = map.get('level')
        self.org_did = map.get('org_did')
        self.org_name = map.get('org_name')
        self.org_user_id = map.get('org_user_id')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        self.type = map.get('type')
        return self


class CreateUserCertResponse(TeaModel):
    def __init__(self, cert_id=None):
        self.cert_id = cert_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cert_id'] = self.cert_id
        return result

    def from_map(self, map={}):
        self.cert_id = map.get('cert_id')
        return self


class DeleteClassUserRequest(TeaModel):
    def __init__(self, class_id=None, org_did=None, org_user_list=None):
        self.class_id = class_id
        self.org_did = org_did
        self.org_user_list = []

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_list:
            for k in self.org_user_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        result['org_user_list'] = []
        if self.org_user_list is not None:
            for k in self.org_user_list:
                result['org_user_list'].append(k.to_map() if k else None)
        else:
            result['org_user_list'] = None
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        self.org_user_list = []
        if map.get('org_user_list') is not None:
            for k in map.get('org_user_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.org_user_list.append(temp_model)
        else:
            self.org_user_list = None
        return self


class DeleteClassUserResponse(TeaModel):
    def __init__(self, fail_list=None):
        self.fail_list = []

    def validate(self):
        if self.fail_list:
            for k in self.fail_list:
                if k :
                    k.validate()

    def to_map(self):
        result = {}
        result['fail_list'] = []
        if self.fail_list is not None:
            for k in self.fail_list:
                result['fail_list'].append(k.to_map() if k else None)
        else:
            result['fail_list'] = None
        return result

    def from_map(self, map={}):
        self.fail_list = []
        if map.get('fail_list') is not None:
            for k in map.get('fail_list'):
                temp_model = OrgUser()
                temp_model = temp_model.from_map(k)
                self.fail_list.append(temp_model)
        else:
            self.fail_list = None
        return self


class CreatePersonRequest(TeaModel):
    def __init__(self, person_name=None, primary_id_no=None, second_id_no_1=None, second_id_no_2=None, second_id_no_3=None):
        self.person_name = person_name
        self.primary_id_no = primary_id_no
        self.second_id_no_1 = second_id_no_1
        self.second_id_no_2 = second_id_no_2
        self.second_id_no_3 = second_id_no_3

    def validate(self):
        if self.person_name:
            self.validate_max_length(person_name, 'person_name', 32)
        if self.primary_id_no:
            self.validate_max_length(primary_id_no, 'primary_id_no', 1024)
        if self.second_id_no_1:
            self.validate_max_length(second_id_no_1, 'second_id_no_1', 1024)
        if self.second_id_no_2:
            self.validate_max_length(second_id_no_2, 'second_id_no_2', 1024)
        if self.second_id_no_3:
            self.validate_max_length(second_id_no_3, 'second_id_no_3', 1024)

    def to_map(self):
        result = {}
        result['person_name'] = self.person_name
        result['primary_id_no'] = self.primary_id_no
        result['second_id_no_1'] = self.second_id_no_1
        result['second_id_no_2'] = self.second_id_no_2
        result['second_id_no_3'] = self.second_id_no_3
        return result

    def from_map(self, map={}):
        self.person_name = map.get('person_name')
        self.primary_id_no = map.get('primary_id_no')
        self.second_id_no_1 = map.get('second_id_no_1')
        self.second_id_no_2 = map.get('second_id_no_2')
        self.second_id_no_3 = map.get('second_id_no_3')
        return self


class CreatePersonResponse(TeaModel):
    def __init__(self, person_did=None):
        self.person_did = person_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.person_did = map.get('person_did')
        return self


class ResumePersonRequest(TeaModel):
    def __init__(self, person_did=None):
        self.person_did = person_did

    def validate(self):
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)

    def to_map(self):
        result = {}
        result['person_did'] = self.person_did
        return result

    def from_map(self, map={}):
        self.person_did = map.get('person_did')
        return self


class ResumePersonResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryOrganizationClassRequest(TeaModel):
    def __init__(self, class_id=None, org_did=None):
        self.class_id = class_id
        self.org_did = org_did

    def validate(self):
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['class_id'] = self.class_id
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.class_id = map.get('class_id')
        self.org_did = map.get('org_did')
        return self


class QueryOrganizationClassResponse(TeaModel):
    def __init__(self, class_name=None, class_status=None, create_time=None, modify_time=None, period=None, type=None, user_num=None):
        self.class_name = class_name
        self.class_status = class_status
        self.create_time = create_time
        self.modify_time = modify_time
        self.period = period
        self.type = type
        self.user_num = user_num

    def validate(self):
        if self.create_time:
            self.validate_pattern(create_time, 'create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.modify_time:
            self.validate_pattern(modify_time, 'modify_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')

    def to_map(self):
        result = {}
        result['class_name'] = self.class_name
        result['class_status'] = self.class_status
        result['create_time'] = self.create_time
        result['modify_time'] = self.modify_time
        result['period'] = self.period
        result['type'] = self.type
        result['user_num'] = self.user_num
        return result

    def from_map(self, map={}):
        self.class_name = map.get('class_name')
        self.class_status = map.get('class_status')
        self.create_time = map.get('create_time')
        self.modify_time = map.get('modify_time')
        self.period = map.get('period')
        self.type = map.get('type')
        self.user_num = map.get('user_num')
        return self


class UpdateOrganizationClassRequest(TeaModel):
    def __init__(self, capacity=None, class_end_time=None, class_id=None, class_name=None, class_start_time=None, class_status=None, org_did=None):
        self.capacity = capacity
        self.class_end_time = class_end_time
        self.class_id = class_id
        self.class_name = class_name
        self.class_start_time = class_start_time
        self.class_status = class_status
        self.org_did = org_did

    def validate(self):
        if self.class_end_time:
            self.validate_pattern(class_end_time, 'class_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.class_id:
            self.validate_max_length(class_id, 'class_id', 128)
        if self.class_name:
            self.validate_max_length(class_name, 'class_name', 64)
        if self.class_start_time:
            self.validate_pattern(class_start_time, 'class_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['capacity'] = self.capacity
        result['class_end_time'] = self.class_end_time
        result['class_id'] = self.class_id
        result['class_name'] = self.class_name
        result['class_start_time'] = self.class_start_time
        result['class_status'] = self.class_status
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.capacity = map.get('capacity')
        self.class_end_time = map.get('class_end_time')
        self.class_id = map.get('class_id')
        self.class_name = map.get('class_name')
        self.class_start_time = map.get('class_start_time')
        self.class_status = map.get('class_status')
        self.org_did = map.get('org_did')
        return self


class UpdateOrganizationClassResponse(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        result = {}
        return result

    def from_map(self, map={}):
        return self


class QueryUserCertRequest(TeaModel):
    def __init__(self, org_did=None, org_user_id=None):
        self.org_did = org_did
        self.org_user_id = org_user_id

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.org_user_id:
            self.validate_max_length(org_user_id, 'org_user_id', 128)

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        self.org_user_id = map.get('org_user_id')
        return self


class QueryUserCertResponse(TeaModel):
    def __init__(self, cert_id_list=None):
        self.cert_id_list = []

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['cert_id_list'] = []
        if self.cert_id_list is not None:
            for k in self.cert_id_list:
                result['cert_id_list'].append(k)
        else:
            result['cert_id_list'] = None
        return result

    def from_map(self, map={}):
        self.cert_id_list = []
        if map.get('cert_id_list') is not None:
            for k in map.get('cert_id_list'):
                self.cert_id_list.append(k)
        else:
            self.cert_id_list = None
        return self


class CreateOrganizationCourseRequest(TeaModel):
    def __init__(self, course_end_time=None, course_name=None, course_start_time=None, org_did=None, period=None):
        self.course_end_time = course_end_time
        self.course_name = course_name
        self.course_start_time = course_start_time
        self.org_did = org_did
        self.period = period

    def validate(self):
        if self.course_end_time:
            self.validate_pattern(course_end_time, 'course_end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.course_name:
            self.validate_max_length(course_name, 'course_name', 64)
        if self.course_start_time:
            self.validate_pattern(course_start_time, 'course_start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?')
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)

    def to_map(self):
        result = {}
        result['course_end_time'] = self.course_end_time
        result['course_name'] = self.course_name
        result['course_start_time'] = self.course_start_time
        result['org_did'] = self.org_did
        result['period'] = self.period
        return result

    def from_map(self, map={}):
        self.course_end_time = map.get('course_end_time')
        self.course_name = map.get('course_name')
        self.course_start_time = map.get('course_start_time')
        self.org_did = map.get('org_did')
        self.period = map.get('period')
        return self


class CreateOrganizationCourseResponse(TeaModel):
    def __init__(self, course_id=None):
        self.course_id = course_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['course_id'] = self.course_id
        return result

    def from_map(self, map={}):
        self.course_id = map.get('course_id')
        return self


class CreateOrganizationRequest(TeaModel):
    def __init__(self, org_code=None, org_name=None):
        self.org_code = org_code
        self.org_name = org_name

    def validate(self):
        if self.org_code:
            self.validate_max_length(org_code, 'org_code', 64)
        if self.org_name:
            self.validate_max_length(org_name, 'org_name', 64)

    def to_map(self):
        result = {}
        result['org_code'] = self.org_code
        result['org_name'] = self.org_name
        return result

    def from_map(self, map={}):
        self.org_code = map.get('org_code')
        self.org_name = map.get('org_name')
        return self


class CreateOrganizationResponse(TeaModel):
    def __init__(self, org_did=None):
        self.org_did = org_did

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        return self


class CreateOrganizationUserRequest(TeaModel):
    def __init__(self, org_did=None, person_did=None, uid=None):
        self.org_did = org_did
        self.person_did = person_did
        self.uid = uid

    def validate(self):
        if self.org_did:
            self.validate_max_length(org_did, 'org_did', 128)
        if self.person_did:
            self.validate_max_length(person_did, 'person_did', 128)
        if self.uid:
            self.validate_max_length(uid, 'uid', 64)

    def to_map(self):
        result = {}
        result['org_did'] = self.org_did
        result['person_did'] = self.person_did
        result['uid'] = self.uid
        return result

    def from_map(self, map={}):
        self.org_did = map.get('org_did')
        self.person_did = map.get('person_did')
        self.uid = map.get('uid')
        return self


class CreateOrganizationUserResponse(TeaModel):
    def __init__(self, org_user_id=None):
        self.org_user_id = org_user_id

    def validate(self):
        pass

    def to_map(self):
        result = {}
        result['org_user_id'] = self.org_user_id
        return result

    def from_map(self, map={}):
        self.org_user_id = map.get('org_user_id')
        return self
