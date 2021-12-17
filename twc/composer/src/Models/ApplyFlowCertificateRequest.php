<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ApplyFlowCertificateRequest extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 证书类型，AntchainCertification（蚂蚁链存证证明）、OrgCertification（公证处存证证明），目前支持公证处
    /**
     * @var string
     */
    public $certificationType;

    // 公证处ID，OrgCertification（公证处存证证明）选填，不填则为默认公证处
    /**
     * @var string
     */
    public $orgId;

    // 是否需要legal码，默认为false即不需要，true表示需要
    /**
     * @var bool
     */
    public $needLegalCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'certificationType' => 'certification_type',
        'orgId'             => 'org_id',
        'needLegalCode'     => 'need_legal_code',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('certificationType', $this->certificationType, true);
        Model::validateRequired('orgId', $this->orgId, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->certificationType) {
            $res['certification_type'] = $this->certificationType;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->needLegalCode) {
            $res['need_legal_code'] = $this->needLegalCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyFlowCertificateRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['certification_type'])) {
            $model->certificationType = $map['certification_type'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['need_legal_code'])) {
            $model->needLegalCode = $map['need_legal_code'];
        }

        return $model;
    }
}
