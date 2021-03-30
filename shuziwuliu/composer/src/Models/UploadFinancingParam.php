<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadFinancingParam extends Model
{
    // 订舱单量（票）
    /**
     * @example 123
     *
     * @var int
     */
    public $bookingCount;

    // 唯一标识
    /**
     * @example 123
     *
     * @var string
     */
    public $code;

    // 结束日期
    /**
     * @example 2020-01-31
     *
     * @var string
     */
    public $endDate;

    // 货代did
    /**
     * @example 暂无
     *
     * @var string
     */
    public $forwarderDid;

    // 开始日期
    /**
     * @example 2020-01-01
     *
     * @var string
     */
    public $startDate;

    // 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
    /**
     * @example 123
     *
     * @var int
     */
    public $teu;

    // 运输总额
    /**
     * @example [{"total_amount";"123.11","currency":“人民币”}]
     *
     * @var string
     */
    public $amounts;
    protected $_name = [
        'bookingCount' => 'booking_count',
        'code'         => 'code',
        'endDate'      => 'end_date',
        'forwarderDid' => 'forwarder_did',
        'startDate'    => 'start_date',
        'teu'          => 'teu',
        'amounts'      => 'amounts',
    ];

    public function validate()
    {
        Model::validateRequired('bookingCount', $this->bookingCount, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('endDate', $this->endDate, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('teu', $this->teu, true);
        Model::validateRequired('amounts', $this->amounts, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bookingCount) {
            $res['booking_count'] = $this->bookingCount;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->teu) {
            $res['teu'] = $this->teu;
        }
        if (null !== $this->amounts) {
            $res['amounts'] = $this->amounts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadFinancingParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['booking_count'])) {
            $model->bookingCount = $map['booking_count'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['teu'])) {
            $model->teu = $map['teu'];
        }
        if (isset($map['amounts'])) {
            $model->amounts = $map['amounts'];
        }

        return $model;
    }
}
