<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class PredictResponse extends Model
{
    // 资产明细ID
    /**
     * @example 112
     *
     * @var string
     */
    public $assetDetailId;

    // 反向指标
    /**
     * @example 0.9123
     *
     * @var string
     */
    public $probability0;

    // 正向指标
    /**
     * @example 0.123
     *
     * @var string
     */
    public $probability1;

    // 身份证号码MD5
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $certNoMd5;

    // 身份证号码MD5
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $mobileMd5;

    // 可选值，A,B,C
    /**
     * @example 分类类型
     *
     * @var string
     */
    public $level;
    protected $_name = [
        'assetDetailId' => 'asset_detail_id',
        'probability0'  => 'probability0',
        'probability1'  => 'probability1',
        'certNoMd5'     => 'cert_no_md5',
        'mobileMd5'     => 'mobile_md5',
        'level'         => 'level',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetDetailId) {
            $res['asset_detail_id'] = $this->assetDetailId;
        }
        if (null !== $this->probability0) {
            $res['probability0'] = $this->probability0;
        }
        if (null !== $this->probability1) {
            $res['probability1'] = $this->probability1;
        }
        if (null !== $this->certNoMd5) {
            $res['cert_no_md5'] = $this->certNoMd5;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PredictResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_detail_id'])) {
            $model->assetDetailId = $map['asset_detail_id'];
        }
        if (isset($map['probability0'])) {
            $model->probability0 = $map['probability0'];
        }
        if (isset($map['probability1'])) {
            $model->probability1 = $map['probability1'];
        }
        if (isset($map['cert_no_md5'])) {
            $model->certNoMd5 = $map['cert_no_md5'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }

        return $model;
    }
}
