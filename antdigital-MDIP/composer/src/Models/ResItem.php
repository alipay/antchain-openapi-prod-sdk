<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;

class ResItem extends Model {
    protected $_name = [
        'sampleId' => 'sample_id',
        'dataId' => 'data_id',
    ];
    public function validate() {
        Model::validateRequired('sampleId', $this->sampleId, true);
        Model::validateRequired('dataId', $this->dataId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->sampleId) {
            $res['sample_id'] = $this->sampleId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['sample_id'])){
            $model->sampleId = $map['sample_id'];
        }
        if(isset($map['data_id'])){
            $model->dataId = $map['data_id'];
        }
        return $model;
    }
    // 客户侧样本唯一id用于映射
    /**
     * @example 077e5fc68135bd8e8223a094029d4cee
     * @var string
     */
    public $sampleId;

    // 蚂蚁侧对应样本唯一id，与客户侧形成映射关系，查询时需要携带该id
    /**
     * @example 46052e46721417297df682ef88a8ab91
     * @var string
     */
    public $dataId;

}
