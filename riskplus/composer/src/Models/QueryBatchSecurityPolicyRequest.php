<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBatchSecurityPolicyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 请求事件编码
    /**
     * @var string
     */
    public $eventCode;

    // 查询客户主体
    /**
     * @var string[]
     */
    public $queryKeys;

    // 用户凭证类型, 手机号/身份证号/加密类型等
    /**
     * @var string
     */
    public $queryKeyType;

    // 额外的事件属性
    /**
     * @var EventInfo[]
     */
    public $eventInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventCode'         => 'event_code',
        'queryKeys'         => 'query_keys',
        'queryKeyType'      => 'query_key_type',
        'eventInfo'         => 'event_info',
    ];

    public function validate()
    {
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('queryKeys', $this->queryKeys, true);
        Model::validateRequired('queryKeyType', $this->queryKeyType, true);
        Model::validateRequired('eventInfo', $this->eventInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->queryKeys) {
            $res['query_keys'] = $this->queryKeys;
        }
        if (null !== $this->queryKeyType) {
            $res['query_key_type'] = $this->queryKeyType;
        }
        if (null !== $this->eventInfo) {
            $res['event_info'] = [];
            if (null !== $this->eventInfo && \is_array($this->eventInfo)) {
                $n = 0;
                foreach ($this->eventInfo as $item) {
                    $res['event_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBatchSecurityPolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['query_keys'])) {
            if (!empty($map['query_keys'])) {
                $model->queryKeys = $map['query_keys'];
            }
        }
        if (isset($map['query_key_type'])) {
            $model->queryKeyType = $map['query_key_type'];
        }
        if (isset($map['event_info'])) {
            if (!empty($map['event_info'])) {
                $model->eventInfo = [];
                $n                = 0;
                foreach ($map['event_info'] as $item) {
                    $model->eventInfo[$n++] = null !== $item ? EventInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
