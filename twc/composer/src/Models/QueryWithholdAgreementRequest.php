<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryWithholdAgreementRequest extends Model
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

    // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
    /**
     * @var string
     */
    public $externalAgreementNo;

    // 第三方用户id
    /**
     * @var string
     */
    public $thirdPartyId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'externalAgreementNo' => 'external_agreement_no',
        'thirdPartyId'        => 'third_party_id',
    ];

    public function validate()
    {
        Model::validateRequired('externalAgreementNo', $this->externalAgreementNo, true);
        Model::validateRequired('thirdPartyId', $this->thirdPartyId, true);
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
        if (null !== $this->externalAgreementNo) {
            $res['external_agreement_no'] = $this->externalAgreementNo;
        }
        if (null !== $this->thirdPartyId) {
            $res['third_party_id'] = $this->thirdPartyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWithholdAgreementRequest
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
        if (isset($map['external_agreement_no'])) {
            $model->externalAgreementNo = $map['external_agreement_no'];
        }
        if (isset($map['third_party_id'])) {
            $model->thirdPartyId = $map['third_party_id'];
        }

        return $model;
    }
}
