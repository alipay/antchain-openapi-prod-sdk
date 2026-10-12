<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class Usage extends Model {
    protected $_name = [
        'resolution' => 'resolution',
        'duration' => 'duration',
        'ratio' => 'ratio',
        'completionTokens' => 'completion_tokens',
        'completionCredits' => 'completion_credits',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->completionTokens) {
            $res['completion_tokens'] = $this->completionTokens;
        }
        if (null !== $this->completionCredits) {
            $res['completion_credits'] = $this->completionCredits;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Usage
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['completion_tokens'])){
            $model->completionTokens = $map['completion_tokens'];
        }
        if(isset($map['completion_credits'])){
            $model->completionCredits = $map['completion_credits'];
        }
        return $model;
    }
    // 分辨率
    /**
     * @example 720p，1080p
     * @var string
     */
    public $resolution;

    // 视频时长（单位：秒）
    /**
     * @example 15
     * @var int
     */
    public $duration;

    // 视频比例
    /**
     * @example 16:9
     * @var string
     */
    public $ratio;

    // 消耗 token 数
    /**
     * @example 10800
     * @var int
     */
    public $completionTokens;

    // 消耗credit数
    /**
     * @example 7
     * @var int
     */
    public $completionCredits;

}
