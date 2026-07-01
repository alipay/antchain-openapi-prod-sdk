<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BindContractMerchantRequest extends Model
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

    // 商户ID
    /**
     * @var string
     */
    public $smid;

    // 商户证件号
    /**
     * @var string
     */
    public $certNo;

    // 代理用户id，传null默认挂接平台方，不允许传空字符串
    /**
     * @var string
     */
    public $agentAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'smid'              => 'smid',
        'certNo'            => 'cert_no',
        'agentAccountId'    => 'agent_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('smid', $this->smid, true);
        Model::validateRequired('certNo', $this->certNo, true);
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
        if (null !== $this->smid) {
            $res['smid'] = $this->smid;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->agentAccountId) {
            $res['agent_account_id'] = $this->agentAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindContractMerchantRequest
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
        if (isset($map['smid'])) {
            $model->smid = $map['smid'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['agent_account_id'])) {
            $model->agentAccountId = $map['agent_account_id'];
        }

        return $model;
    }
}
