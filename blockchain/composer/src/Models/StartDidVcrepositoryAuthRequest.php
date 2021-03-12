<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVcrepositoryAuthRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 配置此did列表，为这些did分配读取目标VC的权限，如果目标VC存储时是明文存储，则操作失败（无需做此权限管控）。
    /**
     * @var string[]
     */
    public $authDidList;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;

    // 目标VC的owner，也就是VC内容中的subject身份。
    /**
     * @var string
     */
    public $did;

    // 指定查询目标VC时的过滤字段（可是标准VC内容的field），指定此字段后，配合需指定filter_value字段。
    /**
     * @var string
     */
    public $filterField;

    // ["VerifiableCredential","DelegateVCRepository","LocationInfo"]
    /**
     * @var string
     */
    public $filterValue;

    // 保留字段，请求增加授权的调用方did身份对应公钥对所有数据参数的签名（目前托管模式可缺省此字段，未来非托管时需请求端签名，需填此字段）
    /**
     * @var string
     */
    public $signature;

    // 读取目标证书VC的id，通过配置此参数可以直接找到目标VC。
    /**
     * @var string
     */
    public $verifiableClaimId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authDidList'       => 'auth_did_list',
        'bizCode'           => 'biz_code',
        'did'               => 'did',
        'filterField'       => 'filter_field',
        'filterValue'       => 'filter_value',
        'signature'         => 'signature',
        'verifiableClaimId' => 'verifiable_claim_id',
    ];

    public function validate()
    {
        Model::validateRequired('authDidList', $this->authDidList, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('filterField', $this->filterField, true);
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
        if (null !== $this->authDidList) {
            $res['auth_did_list'] = $this->authDidList;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->filterField) {
            $res['filter_field'] = $this->filterField;
        }
        if (null !== $this->filterValue) {
            $res['filter_value'] = $this->filterValue;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->verifiableClaimId) {
            $res['verifiable_claim_id'] = $this->verifiableClaimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVcrepositoryAuthRequest
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
        if (isset($map['auth_did_list'])) {
            if (!empty($map['auth_did_list'])) {
                $model->authDidList = $map['auth_did_list'];
            }
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['filter_field'])) {
            $model->filterField = $map['filter_field'];
        }
        if (isset($map['filter_value'])) {
            $model->filterValue = $map['filter_value'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['verifiable_claim_id'])) {
            $model->verifiableClaimId = $map['verifiable_claim_id'];
        }

        return $model;
    }
}
