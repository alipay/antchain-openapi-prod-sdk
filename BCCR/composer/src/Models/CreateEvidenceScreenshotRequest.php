<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceScreenshotRequest extends Model
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

    // 取证用户id
    /**
     * @var string
     */
    public $evidenceUserId;

    // 取证公证处
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证网址信息
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrl;

    // 取证三方账号信息
    /**
     * @var EvidenceThirdPartyInfo
     */
    public $thirdPartyInfo;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'evidenceUserId'    => 'evidence_user_id',
        'notaryOffice'      => 'notary_office',
        'webUrl'            => 'web_url',
        'thirdPartyInfo'    => 'third_party_info',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('webUrl', $this->webUrl, true);
        Model::validateRequired('thirdPartyInfo', $this->thirdPartyInfo, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->webUrl) {
            $res['web_url'] = null !== $this->webUrl ? $this->webUrl->toMap() : null;
        }
        if (null !== $this->thirdPartyInfo) {
            $res['third_party_info'] = null !== $this->thirdPartyInfo ? $this->thirdPartyInfo->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceScreenshotRequest
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
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['web_url'])) {
            $model->webUrl = EvidenceWebUrlInfo::fromMap($map['web_url']);
        }
        if (isset($map['third_party_info'])) {
            $model->thirdPartyInfo = EvidenceThirdPartyInfo::fromMap($map['third_party_info']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
