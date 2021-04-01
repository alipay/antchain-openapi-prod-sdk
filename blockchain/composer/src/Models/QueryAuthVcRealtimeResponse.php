<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthVcRealtimeResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 业务类型场景码，与入参相同。
    /**
     * @var string
     */
    public $bizType;

    // 实际返回的结果数目，如果真是数据量小于request中的size的情况下，total 不等于 size，否则 total 与size值相等。
    /**
     * @var int
     */
    public $total;

    // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
    //
    // {
    // "key":"vc:mychain:01364d9acbda8d09d8c30d94987b40b28f2c28d4ff8f86dbe16197a8f2b0c031",
    // "name": "张三",           //个人姓名
    // "certNo": "210XXXXXX90", //个人证件号码
    // "mobile": "138XXXXXX90", //个人手机号码
    // "orgName": "XXX检测中心",      //检测机构名称
    // "orgNo": "90XXXX00",    //检测机构编号 (可选)
    // "type":"1",             //具体类型说明：1：核酸检测证明，2：疫苗接种证明，其他类型后续扩展
    // "result":"阴性",
    // "date":"2021-03-09",    //检测的日期，请统一使用此标准
    // "timestamp":"检测准确时间戳"   //其它字段可以再补充
    // }
    /**
     * @var string[]
     */
    public $list;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'bizType'    => 'biz_type',
        'total'      => 'total',
        'list'       => 'list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->list) {
            $res['list'] = $this->list;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthVcRealtimeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = $map['list'];
            }
        }

        return $model;
    }
}
