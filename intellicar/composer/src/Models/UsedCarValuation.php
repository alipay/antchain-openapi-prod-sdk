<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class UsedCarValuation extends Model
{
    // 评估金额(万)
    /**
     * @example 1.15-1.43
     *
     * @var string
     */
    public $referenceprice;

    // 官方报价(参考)(万)
    /**
     * @example 54.5
     *
     * @var string
     */
    public $newcarprice;

    // 车型图片(参考)
    /**
     * @example "http://car0.autoimg.cn/cardfs/product/g32/M08/A5/55/t_autohomecar__ChxkPmZijMqAMuHJAALTBQ2Tti4239.jpg"
     *
     * @var string
     */
    public $url;

    // 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
    /**
     * @example 1.30-1.38-1.45
     *
     * @var string
     */
    public $conditiona;

    // 车况正常(万)
    /**
     * @example 1.18-1.29-1.41
     *
     * @var string
     */
    public $conditionb;

    // 车况差(万)
    /**
     * @example 1.04-1.16-1.28
     *
     * @var string
     */
    public $conditionc;
    protected $_name = [
        'referenceprice' => 'referenceprice',
        'newcarprice'    => 'newcarprice',
        'url'            => 'url',
        'conditiona'     => 'conditiona',
        'conditionb'     => 'conditionb',
        'conditionc'     => 'conditionc',
    ];

    public function validate()
    {
        Model::validateRequired('referenceprice', $this->referenceprice, true);
        Model::validateRequired('newcarprice', $this->newcarprice, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('conditiona', $this->conditiona, true);
        Model::validateRequired('conditionb', $this->conditionb, true);
        Model::validateRequired('conditionc', $this->conditionc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->referenceprice) {
            $res['referenceprice'] = $this->referenceprice;
        }
        if (null !== $this->newcarprice) {
            $res['newcarprice'] = $this->newcarprice;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->conditiona) {
            $res['conditiona'] = $this->conditiona;
        }
        if (null !== $this->conditionb) {
            $res['conditionb'] = $this->conditionb;
        }
        if (null !== $this->conditionc) {
            $res['conditionc'] = $this->conditionc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UsedCarValuation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['referenceprice'])) {
            $model->referenceprice = $map['referenceprice'];
        }
        if (isset($map['newcarprice'])) {
            $model->newcarprice = $map['newcarprice'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['conditiona'])) {
            $model->conditiona = $map['conditiona'];
        }
        if (isset($map['conditionb'])) {
            $model->conditionb = $map['conditionb'];
        }
        if (isset($map['conditionc'])) {
            $model->conditionc = $map['conditionc'];
        }

        return $model;
    }
}
