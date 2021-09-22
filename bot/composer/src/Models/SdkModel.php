<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SdkModel extends Model
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

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 设备SDK公钥
    /**
     * @example MEUCIDxNwV7tXGlZ9VW19p...
     *
     * @var string
     */
    public $verifyKey;

    // SDK版本号
    /**
     * @example mqV1.0
     *
     * @var string
     */
    public $sdkVersionStr;

    // sdk模型
    /**
     * @example {"version":"1.0.0"}
     *
     * @var string
     */
    public $metaModel;

    // 平台
    /**
     * @example windows
     *
     * @var string
     */
    public $platform;

    // 公司名称
    /**
     * @example alipay
     *
     * @var string
     */
    public $corpName;
    protected $_name = [
        'id'            => 'id',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
        'verifyKey'     => 'verify_key',
        'sdkVersionStr' => 'sdk_version_str',
        'metaModel'     => 'meta_model',
        'platform'      => 'platform',
        'corpName'      => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('verifyKey', $this->verifyKey, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->verifyKey) {
            $res['verify_key'] = $this->verifyKey;
        }
        if (null !== $this->sdkVersionStr) {
            $res['sdk_version_str'] = $this->sdkVersionStr;
        }
        if (null !== $this->metaModel) {
            $res['meta_model'] = $this->metaModel;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SdkModel
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
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['verify_key'])) {
            $model->verifyKey = $map['verify_key'];
        }
        if (isset($map['sdk_version_str'])) {
            $model->sdkVersionStr = $map['sdk_version_str'];
        }
        if (isset($map['meta_model'])) {
            $model->metaModel = $map['meta_model'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
