<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRiskGeneNode extends Model
{
    // 主企业唯一ID
    /**
     * @example 1
     *
     * @var string
     */
    public $mainCompanyId;

    // 主企业名称
    /**
     * @example 1
     *
     * @var string
     */
    public $mainCompanyName;

    // 节点唯一ID
    /**
     * @example 1
     *
     * @var string
     */
    public $nodeId;

    // 节点名称
    /**
     * @example 1
     *
     * @var string
     */
    public $nodeName;

    // 节点证件号码
    /**
     * @example 1
     *
     * @var string
     */
    public $nodeCertNo;

    // 节点类型，枚举值
    /**
     * @example company
     *
     * @var string
     */
    public $nodeType;

    // 节点扩展信息
    /**
     * @example 节点扩展信息
     *
     * @var string
     */
    public $nodeExtJson;

    // 基因模式
    /**
     * @example risk_label
     *
     * @var string
     */
    public $riskLabel;

    // 基因模式
    /**
     * @example 基因模式
     *
     * @var string
     */
    public $riskMode;
    protected $_name = [
        'mainCompanyId'   => 'main_company_id',
        'mainCompanyName' => 'main_company_name',
        'nodeId'          => 'node_id',
        'nodeName'        => 'node_name',
        'nodeCertNo'      => 'node_cert_no',
        'nodeType'        => 'node_type',
        'nodeExtJson'     => 'node_ext_json',
        'riskLabel'       => 'risk_label',
        'riskMode'        => 'risk_mode',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mainCompanyId) {
            $res['main_company_id'] = $this->mainCompanyId;
        }
        if (null !== $this->mainCompanyName) {
            $res['main_company_name'] = $this->mainCompanyName;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->nodeName) {
            $res['node_name'] = $this->nodeName;
        }
        if (null !== $this->nodeCertNo) {
            $res['node_cert_no'] = $this->nodeCertNo;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->nodeExtJson) {
            $res['node_ext_json'] = $this->nodeExtJson;
        }
        if (null !== $this->riskLabel) {
            $res['risk_label'] = $this->riskLabel;
        }
        if (null !== $this->riskMode) {
            $res['risk_mode'] = $this->riskMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopRiskGeneNode
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['main_company_id'])) {
            $model->mainCompanyId = $map['main_company_id'];
        }
        if (isset($map['main_company_name'])) {
            $model->mainCompanyName = $map['main_company_name'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['node_name'])) {
            $model->nodeName = $map['node_name'];
        }
        if (isset($map['node_cert_no'])) {
            $model->nodeCertNo = $map['node_cert_no'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['node_ext_json'])) {
            $model->nodeExtJson = $map['node_ext_json'];
        }
        if (isset($map['risk_label'])) {
            $model->riskLabel = $map['risk_label'];
        }
        if (isset($map['risk_mode'])) {
            $model->riskMode = $map['risk_mode'];
        }

        return $model;
    }
}
