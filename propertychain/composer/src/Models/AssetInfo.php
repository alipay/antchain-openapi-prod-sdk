<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AssetInfo extends Model
{
    // 资产Id
    /**
     * @example 5676989
     *
     * @var string
     */
    public $assetId;

    // 数据字典Id
    /**
     * @example 5676989
     *
     * @var string
     */
    public $templateId;

    // 资产内容
    /**
     * @example 5676989
     *
     * @var string
     */
    public $content;

    // 链信息
    /**
     * @example 5676989
     *
     * @var BlockchainInfo
     */
    public $blockchainInfo;

    // 短码
    /**
     * @example qrCode
     *
     * @var string
     */
    public $qrCode;
    protected $_name = [
        'assetId'        => 'asset_id',
        'templateId'     => 'template_id',
        'content'        => 'content',
        'blockchainInfo' => 'blockchain_info',
        'qrCode'         => 'qr_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->blockchainInfo) {
            $res['blockchain_info'] = null !== $this->blockchainInfo ? $this->blockchainInfo->toMap() : null;
        }
        if (null !== $this->qrCode) {
            $res['qr_code'] = $this->qrCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['blockchain_info'])) {
            $model->blockchainInfo = BlockchainInfo::fromMap($map['blockchain_info']);
        }
        if (isset($map['qr_code'])) {
            $model->qrCode = $map['qr_code'];
        }

        return $model;
    }
}
