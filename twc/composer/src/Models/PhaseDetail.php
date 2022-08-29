<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class PhaseDetail extends Model
{
    // 阶段id
    /**
     * @example 877c4383-9c83-477b-b7ec-03828a946***
     *
     * @var string
     */
    public $phaseId;

    // 阶段编号
    /**
     * @example 1
     *
     * @var int
     */
    public $phaseNo;

    // 阶段存证时间
    /**
     * @example 1661262742335
     *
     * @var int
     */
    public $registerTime;

    // 阶段存证凭据
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     *
     * @var string
     */
    public $txHash;

    // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
    /**
     * @example Hash/Structure
     *
     * @var string
     */
    public $dataType;

    // 阶段存证内容
    // 如果模板数据类型定义是Hash(哈希)则返回存证时Hash
    // 如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
    /**
     * @example 111111
     *
     * @var string
     */
    public $notaryContent;

    // 模板字段类型为Structure时才有值，结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
    /**
     * @example { "name":"名称" }
     *
     * @var string
     */
    public $dataTypeKey;
    protected $_name = [
        'phaseId'       => 'phase_id',
        'phaseNo'       => 'phase_no',
        'registerTime'  => 'register_time',
        'txHash'        => 'tx_hash',
        'dataType'      => 'data_type',
        'notaryContent' => 'notary_content',
        'dataTypeKey'   => 'data_type_key',
    ];

    public function validate()
    {
        Model::validateRequired('phaseId', $this->phaseId, true);
        Model::validateRequired('phaseNo', $this->phaseNo, true);
        Model::validateRequired('registerTime', $this->registerTime, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('dataTypeKey', $this->dataTypeKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phaseId) {
            $res['phase_id'] = $this->phaseId;
        }
        if (null !== $this->phaseNo) {
            $res['phase_no'] = $this->phaseNo;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->dataTypeKey) {
            $res['data_type_key'] = $this->dataTypeKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhaseDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phase_id'])) {
            $model->phaseId = $map['phase_id'];
        }
        if (isset($map['phase_no'])) {
            $model->phaseNo = $map['phase_no'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['data_type_key'])) {
            $model->dataTypeKey = $map['data_type_key'];
        }

        return $model;
    }
}
