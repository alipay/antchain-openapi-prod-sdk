<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadOrderBooking extends Model {
    protected $_name = [
        'bookingNo' => 'booking_no',
        'containerNos' => 'container_nos',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->containerNos) {
            $res['container_nos'] = $this->containerNos;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadOrderBooking
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['booking_no'])){
            $model->bookingNo = $map['booking_no'];
        }
        if(isset($map['container_nos'])){
            $model->containerNos = $map['container_nos'];
        }
        return $model;
    }
    // 订舱单号
    /**
     * @example 暂无
     * @var string
     */
    public $bookingNo;

    // 集装箱号  json字符串上传
    /**
     * @example {"123","123"}
     * @var string
     */
    public $containerNos;

}
