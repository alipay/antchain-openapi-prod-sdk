<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryIrBrandRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 品牌MD5的 32位小写
    /**
     * @var string
     */
    public $brandmd5;

    // 开始日期，包含填写时间 ，目前与end_date最大间隔不大于7天
    /**
     * @var string
     */
    public $beginDate;

    // 结束日期，包含填写时间， 目前与start_date最大间隔不大于7天
    /**
     * @var string
     */
    public $endDate;

    // 场景码,brand_overview 品牌汇总；brand_citylevel 品牌城市汇总
    /**
     * @var string
     */
    public $scene;
    protected $_name = [
        'authToken' => 'auth_token',
        'brandmd5'  => 'brandmd5',
        'beginDate' => 'begin_date',
        'endDate'   => 'end_date',
        'scene'     => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('brandmd5', $this->brandmd5, true);
        Model::validateRequired('beginDate', $this->beginDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('scene', $this->scene, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->brandmd5) {
            $res['brandmd5'] = $this->brandmd5;
        }
        if (null !== $this->beginDate) {
            $res['begin_date'] = $this->beginDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIrBrandRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['brandmd5'])) {
            $model->brandmd5 = $map['brandmd5'];
        }
        if (isset($map['begin_date'])) {
            $model->beginDate = $map['begin_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
