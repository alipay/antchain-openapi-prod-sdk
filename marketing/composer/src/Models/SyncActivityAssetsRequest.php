<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class SyncActivityAssetsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 情报标识
    /**
     * @var string
     */
    public $informationId;

    // 附件信息
    /**
     * @var Attachment[]
     */
    public $attachments;

    // 资产详情列表
    /**
     * @var Asset[]
     */
    public $assets;
    protected $_name = [
        'authToken'     => 'auth_token',
        'informationId' => 'information_id',
        'attachments'   => 'attachments',
        'assets'        => 'assets',
    ];

    public function validate()
    {
        Model::validateRequired('informationId', $this->informationId, true);
        Model::validateRequired('attachments', $this->attachments, true);
        Model::validateRequired('assets', $this->assets, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->informationId) {
            $res['information_id'] = $this->informationId;
        }
        if (null !== $this->attachments) {
            $res['attachments'] = [];
            if (null !== $this->attachments && \is_array($this->attachments)) {
                $n = 0;
                foreach ($this->attachments as $item) {
                    $res['attachments'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->assets) {
            $res['assets'] = [];
            if (null !== $this->assets && \is_array($this->assets)) {
                $n = 0;
                foreach ($this->assets as $item) {
                    $res['assets'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncActivityAssetsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['information_id'])) {
            $model->informationId = $map['information_id'];
        }
        if (isset($map['attachments'])) {
            if (!empty($map['attachments'])) {
                $model->attachments = [];
                $n                  = 0;
                foreach ($map['attachments'] as $item) {
                    $model->attachments[$n++] = null !== $item ? Attachment::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['assets'])) {
            if (!empty($map['assets'])) {
                $model->assets = [];
                $n             = 0;
                foreach ($map['assets'] as $item) {
                    $model->assets[$n++] = null !== $item ? Asset::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
