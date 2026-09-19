<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeMerchantriskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyNo' => 'apply_no',
        'channelTenant' => 'channel_tenant',
        'sourceType' => 'source_type',
    ];
    public function validate() {
        Model::validateRequired('applyNo', $this->applyNo, true);
        Model::validateRequired('channelTenant', $this->channelTenant, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->channelTenant) {
            $res['channel_tenant'] = $this->channelTenant;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgeMerchantriskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['apply_no'])){
            $model->applyNo = $map['apply_no'];
        }
        if(isset($map['channel_tenant'])){
            $model->channelTenant = $map['channel_tenant'];
        }
        if(isset($map['source_type'])){
            $model->sourceType = $map['source_type'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 申请单号
    /**
     * @var string
     */
    public $applyNo;

    // 渠道租户
    /**
     * @var string
     */
    public $channelTenant;

    // 来源类型
    /**
     * @var string
     */
    public $sourceType;

}
