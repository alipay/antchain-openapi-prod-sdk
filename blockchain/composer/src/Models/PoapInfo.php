<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PoapInfo extends Model
{
    // 徽章ID，具有唯一性
    /**
     * @example ACconstellation_ADF
     *
     * @var string
     */
    public $poapId;

    // 徽章名字
    /**
     * @example 星座徽章
     *
     * @var string
     */
    public $poapName;

    // 徽章HASH
    /**
     * @example 0fddf9087f7c5bd71c2fabb4b520bdec9fe7157c00807b26f9ddff9cd5d73d77
     *
     * @var string
     */
    public $uniHash;

    // 状态，枚举值
    /**
     * @example FINISHED
     *
     * @var string
     */
    public $status;

    // 徽章资源 URL
    /**
     * @example http://xxxx.ff.png
     *
     * @var string
     */
    public $poapUrl;

    // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
    /**
     * @example 2D_IMAGE
     *
     * @var string
     */
    public $renderType;

    // 3D模型降级使用的资源URL
    /**
     * @example http://xxx.png
     *
     * @var string
     */
    public $faultToleranceUrl;
    protected $_name = [
        'poapId'            => 'poap_id',
        'poapName'          => 'poap_name',
        'uniHash'           => 'uni_hash',
        'status'            => 'status',
        'poapUrl'           => 'poap_url',
        'renderType'        => 'render_type',
        'faultToleranceUrl' => 'fault_tolerance_url',
    ];

    public function validate()
    {
        Model::validateRequired('poapId', $this->poapId, true);
        Model::validateRequired('poapName', $this->poapName, true);
        Model::validateRequired('uniHash', $this->uniHash, true);
        Model::validateRequired('poapUrl', $this->poapUrl, true);
        Model::validateRequired('renderType', $this->renderType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->poapId) {
            $res['poap_id'] = $this->poapId;
        }
        if (null !== $this->poapName) {
            $res['poap_name'] = $this->poapName;
        }
        if (null !== $this->uniHash) {
            $res['uni_hash'] = $this->uniHash;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->poapUrl) {
            $res['poap_url'] = $this->poapUrl;
        }
        if (null !== $this->renderType) {
            $res['render_type'] = $this->renderType;
        }
        if (null !== $this->faultToleranceUrl) {
            $res['fault_tolerance_url'] = $this->faultToleranceUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoapInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['poap_id'])) {
            $model->poapId = $map['poap_id'];
        }
        if (isset($map['poap_name'])) {
            $model->poapName = $map['poap_name'];
        }
        if (isset($map['uni_hash'])) {
            $model->uniHash = $map['uni_hash'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['poap_url'])) {
            $model->poapUrl = $map['poap_url'];
        }
        if (isset($map['render_type'])) {
            $model->renderType = $map['render_type'];
        }
        if (isset($map['fault_tolerance_url'])) {
            $model->faultToleranceUrl = $map['fault_tolerance_url'];
        }

        return $model;
    }
}
