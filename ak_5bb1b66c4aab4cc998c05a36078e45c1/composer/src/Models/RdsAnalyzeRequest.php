<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class RdsAnalyzeRequest extends Model
{
    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $appid;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $bizNo;

    // 213
    /**
     * @example 123
     *
     * @var string
     */
    public $scene;

    // 123
    /**
     * @example 1231
     *
     * @var string
     */
    public $token;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $data;

    // 123
    /**
     * @example 123
     *
     * @var string
     */
    public $extra;
    protected $_name = [
        'appid' => 'appid',
        'bizNo' => 'biz_no',
        'scene' => 'scene',
        'token' => 'token',
        'data'  => 'data',
        'extra' => 'extra',
    ];

    public function validate()
    {
        Model::validateRequired('appid', $this->appid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->extra) {
            $res['extra'] = $this->extra;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RdsAnalyzeRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['extra'])) {
            $model->extra = $map['extra'];
        }

        return $model;
    }
}
