<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPGalleryInstruction extends Model
{
    // 下载时间
    /**
     * @example 1694896477580
     *
     * @var int
     */
    public $timestamp;

    // 授权订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipOrderId;

    // IP链上ID
    /**
     * @example 5387548364587381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipId;

    // 图库链接
    /**
     * @example oss://myexchange/1259371fc8f77d37...5dfb6d130facf32dd6d4257fa0.zip
     *
     * @var string
     */
    public $ipGalleryUrl;

    // 图库下载链接，默认过期时间2小时
    /**
     * @example https:xxx...
     *
     * @var string
     */
    public $ipGalleryTemporaryUrl;

    // 图库版本
    /**
     * @example 2
     *
     * @var int
     */
    public $ipGalleryVersion;

    // IP当前图库状态：0 生效中，1 已失效
    /**
     * @example 0
     *
     * @var int
     */
    public $ipGalleryStatus;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'timestamp'             => 'timestamp',
        'ipOrderId'             => 'ip_order_id',
        'ipId'                  => 'ip_id',
        'ipGalleryUrl'          => 'ip_gallery_url',
        'ipGalleryTemporaryUrl' => 'ip_gallery_temporary_url',
        'ipGalleryVersion'      => 'ip_gallery_version',
        'ipGalleryStatus'       => 'ip_gallery_status',
        'extInfo'               => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('ipOrderId', $this->ipOrderId, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('ipGalleryUrl', $this->ipGalleryUrl, true);
        Model::validateRequired('ipGalleryTemporaryUrl', $this->ipGalleryTemporaryUrl, true);
        Model::validateRequired('ipGalleryVersion', $this->ipGalleryVersion, true);
        Model::validateRequired('ipGalleryStatus', $this->ipGalleryStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->ipGalleryUrl) {
            $res['ip_gallery_url'] = $this->ipGalleryUrl;
        }
        if (null !== $this->ipGalleryTemporaryUrl) {
            $res['ip_gallery_temporary_url'] = $this->ipGalleryTemporaryUrl;
        }
        if (null !== $this->ipGalleryVersion) {
            $res['ip_gallery_version'] = $this->ipGalleryVersion;
        }
        if (null !== $this->ipGalleryStatus) {
            $res['ip_gallery_status'] = $this->ipGalleryStatus;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPGalleryInstruction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['ip_gallery_url'])) {
            $model->ipGalleryUrl = $map['ip_gallery_url'];
        }
        if (isset($map['ip_gallery_temporary_url'])) {
            $model->ipGalleryTemporaryUrl = $map['ip_gallery_temporary_url'];
        }
        if (isset($map['ip_gallery_version'])) {
            $model->ipGalleryVersion = $map['ip_gallery_version'];
        }
        if (isset($map['ip_gallery_status'])) {
            $model->ipGalleryStatus = $map['ip_gallery_status'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
