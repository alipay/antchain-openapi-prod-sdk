<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyDubbridgeDefininnerchannelRequest extends Model
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

    // 调用流水
    /**
     * @var string
     */
    public $seqNo;

    // 机构平台接口名
    /**
     * @var string
     */
    public $apiName;

    // 机构编号
    /**
     * @var string
     */
    public $instMemberCode;

    // 业务参数Json
    /**
     * @var string
     */
    public $bizParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'seqNo'             => 'seq_no',
        'apiName'           => 'api_name',
        'instMemberCode'    => 'inst_member_code',
        'bizParam'          => 'biz_param',
    ];

    public function validate()
    {
        Model::validateRequired('seqNo', $this->seqNo, true);
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('instMemberCode', $this->instMemberCode, true);
        Model::validateRequired('bizParam', $this->bizParam, true);
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
        if (null !== $this->seqNo) {
            $res['seq_no'] = $this->seqNo;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->instMemberCode) {
            $res['inst_member_code'] = $this->instMemberCode;
        }
        if (null !== $this->bizParam) {
            $res['biz_param'] = $this->bizParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyDubbridgeDefininnerchannelRequest
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
        if (isset($map['seq_no'])) {
            $model->seqNo = $map['seq_no'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['inst_member_code'])) {
            $model->instMemberCode = $map['inst_member_code'];
        }
        if (isset($map['biz_param'])) {
            $model->bizParam = $map['biz_param'];
        }

        return $model;
    }
}
