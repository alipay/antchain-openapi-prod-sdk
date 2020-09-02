<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class AntiPiracyResultObject extends Model {
    protected $_name = [
        'infrHost' => 'infr_host',
        'infrTime' => 'infr_time',
        'infrTitle' => 'infr_title',
        'infrUrl' => 'infr_url',
        'productionType' => 'production_type',
        'similarity' => 'similarity',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->infrHost) {
            $res['infr_host'] = $this->infrHost;
        }
        if (null !== $this->infrTime) {
            $res['infr_time'] = $this->infrTime;
        }
        if (null !== $this->infrTitle) {
            $res['infr_title'] = $this->infrTitle;
        }
        if (null !== $this->infrUrl) {
            $res['infr_url'] = $this->infrUrl;
        }
        if (null !== $this->productionType) {
            $res['production_type'] = $this->productionType;
        }
        if (null !== $this->similarity) {
            $res['similarity'] = $this->similarity;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AntiPiracyResultObject
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['infr_host'])){
            $model->infrHost = $map['infr_host'];
        }
        if(isset($map['infr_time'])){
            $model->infrTime = $map['infr_time'];
        }
        if(isset($map['infr_title'])){
            $model->infrTitle = $map['infr_title'];
        }
        if(isset($map['infr_url'])){
            $model->infrUrl = $map['infr_url'];
        }
        if(isset($map['production_type'])){
            $model->productionType = $map['production_type'];
        }
        if(isset($map['similarity'])){
            $model->similarity = $map['similarity'];
        }
        return $model;
    }
    // 侵权主体
    /**
     * @example infr_host
     * @var string
     */
    public $infrHost;

    // 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
    /**
     * @example 1567740257000
     * @var int
     */
    public $infrTime;

    // 侵权标题
    /**
     * @example title
     * @var string
     */
    public $infrTitle;

    // 侵权网址
    /**
     * @example www.baidu.com
     * @var string
     */
    public $infrUrl;

    // 默认值：VIDEO
    /**
     * @example VIDEO
     * @var string
     */
    public $productionType;

    // 相似度
    /**
     * @example 66.66
     * @var string
     */
    public $similarity;

}
