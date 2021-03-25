<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SupportedRegion extends Model {
    protected $_name = [
        'fileSize' => 'file_size',
        'fileStatus' => 'file_status',
        'originalFileName' => 'original_file_name',
        'regionNum' => 'region_num',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileStatus) {
            $res['file_status'] = $this->fileStatus;
        }
        if (null !== $this->originalFileName) {
            $res['original_file_name'] = $this->originalFileName;
        }
        if (null !== $this->regionNum) {
            $res['region_num'] = $this->regionNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SupportedRegion
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
        }
        if(isset($map['file_status'])){
            $model->fileStatus = $map['file_status'];
        }
        if(isset($map['original_file_name'])){
            $model->originalFileName = $map['original_file_name'];
        }
        if(isset($map['region_num'])){
            $model->regionNum = $map['region_num'];
        }
        return $model;
    }
    // file_size
    /**
     * @example 
     * @var int
     */
    public $fileSize;

    // file_status
    /**
     * @example file_status
     * @var string
     */
    public $fileStatus;

    // original_file_name
    /**
     * @example original_file_name
     * @var string
     */
    public $originalFileName;

    // region_id
    /**
     * @example region_id
     * @var string
     */
    public $regionNum;

}
