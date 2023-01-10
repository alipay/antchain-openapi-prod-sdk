<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeAccountStatusRequest extends Model
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

    // 客户编号（资产方用户唯一标记二选一）
    /**
     * @var string
     */
    public $customNo;

    // 资产方用户唯一标识（资产方用户唯一标记二选一）
    /**
     * @var string
     */
    public $openId;

    // 查询业务
    /**
     * @var string
     */
    public $bizType;

    // 渠道号
    /**
     * @var string
     */
    public $channelCode;

    // 渠道号
    /**
     * @var string
     */
    public $orgCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customNo'          => 'custom_no',
        'openId'            => 'open_id',
        'bizType'           => 'biz_type',
        'channelCode'       => 'channel_code',
        'orgCode'           => 'org_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
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
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->orgCode) {
            $res['org_code'] = $this->orgCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeAccountStatusRequest
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
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['org_code'])) {
            $model->orgCode = $map['org_code'];
        }

        return $model;
    }
}
