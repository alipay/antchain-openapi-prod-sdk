<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DataVerifyFailureData extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // Alipay-0101
    /**
     * @example 场景码
     *
     * @var string
     */
    public $scene;

    // 设备ID
    /**
     * @example device_id_001
     *
     * @var string
     */
    public $deviceId;

    // 发行设备ID
    /**
     * @example 00202009111700539276
     *
     * @var string
     */
    public $disDeviceId;

    // 类型：0:数据上报;1:数据完整性校验
    /**
     * @example 0
     *
     * @var int
     */
    public $type;

    // c89b65a2e3afd604977c0....
    /**
     * @example 公钥
     *
     * @var string
     */
    public $publicKey;

    // 验签类型：0(RAW_DATA)；1(公钥格式为PEM)；2(公钥格式为DER)
    /**
     * @example 0
     *
     * @var int
     */
    public $formatType;

    // 验证内容hash
    /**
     * @example aa5304221185b370ea84d...
     *
     * @var string
     */
    public $contentId;

    // 验证内容
    /**
     * @example {"content":"demo",...}
     *
     * @var string
     */
    public $content;

    // 签名
    /**
     * @example 9b47e12b0ddb8df...
     *
     * @var string
     */
    public $signature;

    // 错误信息
    /**
     * @example 数据验真失败
     *
     * @var string
     */
    public $failMessage;

    // 补充数据
    /**
     * @example {“DEVICE-ID”:"DEMO-001"}
     *
     * @var string
     */
    public $extraData;

    // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
    /**
     * @example 0
     *
     * @var int
     */
    public $source;
    protected $_name = [
        'id'          => 'id',
        'gmtCreate'   => 'gmt_create',
        'scene'       => 'scene',
        'deviceId'    => 'device_id',
        'disDeviceId' => 'dis_device_id',
        'type'        => 'type',
        'publicKey'   => 'public_key',
        'formatType'  => 'format_type',
        'contentId'   => 'content_id',
        'content'     => 'content',
        'signature'   => 'signature',
        'failMessage' => 'fail_message',
        'extraData'   => 'extra_data',
        'source'      => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->disDeviceId) {
            $res['dis_device_id'] = $this->disDeviceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        if (null !== $this->formatType) {
            $res['format_type'] = $this->formatType;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->failMessage) {
            $res['fail_message'] = $this->failMessage;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = $this->extraData;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataVerifyFailureData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['dis_device_id'])) {
            $model->disDeviceId = $map['dis_device_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['public_key'])) {
            $model->publicKey = $map['public_key'];
        }
        if (isset($map['format_type'])) {
            $model->formatType = $map['format_type'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['fail_message'])) {
            $model->failMessage = $map['fail_message'];
        }
        if (isset($map['extra_data'])) {
            $model->extraData = $map['extra_data'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
