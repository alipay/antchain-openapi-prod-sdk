<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoUsciIndustryPair extends Model {
    protected $_name = [
        'usci' => 'usci',
        'industry' => 'industry',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->usci) {
            $res['usci'] = $this->usci;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoUsciIndustryPair
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['usci'])){
            $model->usci = $map['usci'];
        }
        if(isset($map['industry'])){
            $model->industry = $map['industry'];
        }
        return $model;
    }
    // 统一社会信用代码
    /**
     * @example 统一社会信用代码
     * @var string
     */
    public $usci;

    // 行业类型
    /**
     * @example 行业类型
     * @var string
     */
    public $industry;

}
