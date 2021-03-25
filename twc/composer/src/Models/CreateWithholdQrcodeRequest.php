<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateWithholdQrcodeRequest extends Model
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

    // 第三方的用户id
    /**
     * @var string
     */
    public $thirdPartyId;

    // 请求签约的协议号
    /**
     * @var string
     */
    public $externalAgreementNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'thirdPartyId'        => 'third_party_id',
        'externalAgreementNo' => 'external_agreement_no',
    ];

    public function validate()
    {
        Model::validateRequired('thirdPartyId', $this->thirdPartyId, true);
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
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
        if (null !== $this->thirdPartyId) {
            $res['third_party_id'] = $this->thirdPartyId;
        }
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWithholdQrcodeRequest
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
        if (isset($map['third_party_id'])) {
            $model->thirdPartyId = $map['third_party_id'];
        }
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }

        return $model;
    }
}
