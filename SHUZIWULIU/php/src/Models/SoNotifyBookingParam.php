<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SoNotifyBookingParam extends Model {
    protected $_name = [
        'action' => 'action',
        'bookingNo' => 'booking_no',
        'carrier' => 'carrier',
        'containerParams' => 'container_params',
        'customsClearance' => 'customs_clearance',
        'cy' => 'cy',
        'cyClosing' => 'cy_closing',
        'etd' => 'etd',
        'port' => 'port',
        'siClosing' => 'si_closing',
        'vessel' => 'vessel',
        'voyage' => 'voyage',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->containerParams) {
            $res['container_params'] = $this->containerParams;
        }
        if (null !== $this->customsClearance) {
            $res['customs_clearance'] = $this->customsClearance;
        }
        if (null !== $this->cy) {
            $res['cy'] = $this->cy;
        }
        if (null !== $this->cyClosing) {
            $res['cy_closing'] = $this->cyClosing;
        }
        if (null !== $this->etd) {
            $res['etd'] = $this->etd;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->siClosing) {
            $res['si_closing'] = $this->siClosing;
        }
        if (null !== $this->vessel) {
            $res['vessel'] = $this->vessel;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SoNotifyBookingParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['booking_no'])){
            $model->bookingNo = $map['booking_no'];
        }
        if(isset($map['carrier'])){
            $model->carrier = $map['carrier'];
        }
        if(isset($map['container_params'])){
            $model->containerParams = $map['container_params'];
        }
        if(isset($map['customs_clearance'])){
            $model->customsClearance = $map['customs_clearance'];
        }
        if(isset($map['cy'])){
            $model->cy = $map['cy'];
        }
        if(isset($map['cy_closing'])){
            $model->cyClosing = $map['cy_closing'];
        }
        if(isset($map['etd'])){
            $model->etd = $map['etd'];
        }
        if(isset($map['port'])){
            $model->port = $map['port'];
        }
        if(isset($map['si_closing'])){
            $model->siClosing = $map['si_closing'];
        }
        if(isset($map['vessel'])){
            $model->vessel = $map['vessel'];
        }
        if(isset($map['voyage'])){
            $model->voyage = $map['voyage'];
        }
        return $model;
    }
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example 暂无
     * @var string
     */
    public $action;

    // 订舱单号
    /**
     * @example 123456789
     * @var string
     */
    public $bookingNo;

    // 船公司  业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $carrier;

    // 箱型箱量 json格式 业务必填
    // [{"containerVolume":"33","containerType":"22"}]
    // containerVolume--箱量 业务必填
    // containerType--箱型 业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $containerParams;

    // 截关时间
    /**
     * @example 
     * @var int
     */
    public $customsClearance;

    // 场站
    /**
     * @example 暂无
     * @var string
     */
    public $cy;

    // 截港时间
    /**
     * @example 
     * @var int
     */
    public $cyClosing;

    // 预计船期
    /**
     * @example 
     * @var int
     */
    public $etd;

    // 港口
    /**
     * @example 暂无
     * @var string
     */
    public $port;

    // 截单时间
    /**
     * @example 暂无
     * @var int
     */
    public $siClosing;

    // 船名  业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $vessel;

    // 航次 业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $voyage;

}
