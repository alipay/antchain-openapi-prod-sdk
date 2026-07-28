<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;

class Item extends Model {
    protected $_name = [
        'sampleId' => 'sample_id',
        'certNo' => 'cert_no',
        'mobile' => 'mobile',
        'sampleBackDate' => 'sample_back_date',
    ];
    public function validate() {
        Model::validateRequired('sampleId', $this->sampleId, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sampleId) {
            $res['sample_id'] = $this->sampleId;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->sampleBackDate) {
            $res['sample_back_date'] = $this->sampleBackDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Item
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['sample_id'])){
            $model->sampleId = $map['sample_id'];
        }
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['sample_back_date'])){
            $model->sampleBackDate = $map['sample_back_date'];
        }
        return $model;
    }
    // 样本唯一id
    /**
     * @example 7ef15c83-57b4-4932-9180-35b11b102075
     * @var string
     */
    public $sampleId;

    // 小写加密身份证（身份证如果有X，要大写再生成MD5）
    /**
     * @example 51db170b113f8c57533ae28605f2b76b
     * @var string
     */
    public $certNo;

    // 手机号加密
    /**
     * @example 077e5fc68135bd8e8223a094029d4cee
     * @var string
     */
    public $mobile;

    // 回溯日期（yyyyMMdd格式）
    /**
     * @example 20260620
     * @var string
     */
    public $sampleBackDate;

}
