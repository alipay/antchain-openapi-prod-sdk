<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAioOutboundRecordurlRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tntInstId;

    // 业务code
    /**
     * @var string
     */
    public $bizCode;

    // acid
    /**
     * @var string
     */
    public $acid;

    // callRequestId
    /**
     * @var string
     */
    public $callRequestId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tntInstId'         => 'tnt_inst_id',
        'bizCode'           => 'biz_code',
        'acid'              => 'acid',
        'callRequestId'     => 'call_request_id',
    ];

    public function validate()
    {
        Model::validateRequired('tntInstId', $this->tntInstId, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
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
        if (null !== $this->tntInstId) {
            $res['tnt_inst_id'] = $this->tntInstId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->acid) {
            $res['acid'] = $this->acid;
        }
        if (null !== $this->callRequestId) {
            $res['call_request_id'] = $this->callRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAioOutboundRecordurlRequest
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
        if (isset($map['tnt_inst_id'])) {
            $model->tntInstId = $map['tnt_inst_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['acid'])) {
            $model->acid = $map['acid'];
        }
        if (isset($map['call_request_id'])) {
            $model->callRequestId = $map['call_request_id'];
        }

        return $model;
    }
}
