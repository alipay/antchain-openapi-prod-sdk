<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceLiveRequest extends Model
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
     * @var int
     */
    public $evidenceUserId;

    // 取证公证处
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证类型（通用直播取证：DEFAULT）
    /**
     * @var string
     */
    public $type;

    // 取证网址信息
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrls;

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
        'type'              => 'type',
        'webUrls'           => 'web_urls',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('webUrls', $this->webUrls, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->webUrls) {
            $res['web_urls'] = null !== $this->webUrls ? $this->webUrls->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceLiveRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['web_urls'])) {
            $model->webUrls = EvidenceWebUrlInfo::fromMap($map['web_urls']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
