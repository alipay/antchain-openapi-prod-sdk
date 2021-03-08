<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class JudgeAliyunAuthorityRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 阿里云POP API名称
    /**
     * @var string
     */
    public $action;

    // 阿里云资源描述数组
    /**
     * @var AliyunResource[]
     */
    public $aliyunResources;

    // 自定义条件
    /**
     * @var Condition[]
     */
    public $conditions;

    // regionId
    /**
     * @var string
     */
    public $regionId;

    // 阿里云POP透传参数
    /**
     * @var AliyunPopRequestInfo
     */
    public $requestInfo;

    // 阿里云服务名称
    /**
     * @var string
     */
    public $serviceName;

    // 0000000001
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'action'          => 'action',
        'aliyunResources' => 'aliyun_resources',
        'conditions'      => 'conditions',
        'regionId'        => 'region_id',
        'requestInfo'     => 'request_info',
        'serviceName'     => 'service_name',
        'userId'          => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('aliyunResources', $this->aliyunResources, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('requestInfo', $this->requestInfo, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->aliyunResources) {
            $res['aliyun_resources'] = [];
            if (null !== $this->aliyunResources && \is_array($this->aliyunResources)) {
                $n = 0;
                foreach ($this->aliyunResources as $item) {
                    $res['aliyun_resources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->requestInfo) {
            $res['request_info'] = null !== $this->requestInfo ? $this->requestInfo->toMap() : null;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAliyunAuthorityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['aliyun_resources'])) {
            if (!empty($map['aliyun_resources'])) {
                $model->aliyunResources = [];
                $n                      = 0;
                foreach ($map['aliyun_resources'] as $item) {
                    $model->aliyunResources[$n++] = null !== $item ? AliyunResource::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? Condition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['request_info'])) {
            $model->requestInfo = AliyunPopRequestInfo::fromMap($map['request_info']);
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
