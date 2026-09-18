<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class MaoLicenseValidPeriod extends Model {
    protected $_name = [
        'startDate' => 'start_date',
        'endDate' => 'end_date',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaoLicenseValidPeriod
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        if(isset($map['end_date'])){
            $model->endDate = $map['end_date'];
        }
        return $model;
    }
    // 营业执照有效期-起
    /**
     * @example 营业执照有效期-起
     * @var string
     */
    public $startDate;

    // 营业执照有效期-止
    /**
     * @example 营业执照有效期-止
     * @var string
     */
    public $endDate;

}
